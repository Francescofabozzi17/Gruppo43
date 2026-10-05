package implementazioneDao;

import dao.DocenteDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class DocentePostgresDao implements DocenteDao {
    private final Connection connection;

    public DocentePostgresDao(Connection connection){
        this.connection = connection;
    }
    @Override
    public void register(String nome, String cognome, String email, String login, String passwordhash) throws Exception {
        String sqlUtente = "INSERT INTO Utente (login,password_hash) VALUES (? , ?)";
        String sqlDocente = "INSERT INTO Utente (login ,nome , cognome , email ) VALUES (? , ? , ? , ?)";
        if (!connection.getAutoCommit())
            throw new IllegalStateException("Una transazione è gia in corso");

        connection.getAutoCommit(false);
        try {
            try (PreparedStatement statement = connection.prepareStatement(sqlUtente)) {
                statement.setString(1, login);
                statement.setString(2, passwordhash);
                statement.executeUpdate();
            }
            try (PreparedStatement statement = connection.prepareStatement(sqlDocente)) {
                statement.setString(1, login);
                statement.setString(2, nome);
                statement.setString(3, cognome);
                statement.setString(4, email);
                statement.executeUpdate();
            }
            connection.commit();

        } catch (Exception e) {
            connection.rollback();
            throw e;

        } finally {
            connection.setAutoCommit(true);
        }
    }


    @Override
    public void getdocente(String login, ArrayList<String> nome, ArrayList<String> cognome, ArrayList<String> email) throws Exception {
            String sql = " SELECT nome , cognome , email " + " FROM Docente " + " WHERE login = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {

            statement.setString(1, login);
            try (ResultSet risultato = statement.executeQuery()) {
                if (risultato.next()) {
                    nome.add(risultato.getString("nome"));
                    cognome.add(risultato.getString("cognome"));
                    email.add(risultato.getString("email"));

                }
            }

        }

    }

    @Override
        public void getAllDocenti(ArrayList<String> nome, ArrayList<String> cognome, ArrayList<String> email, ArrayList<String> login) throws Exception {
            String sql = "SELECT nome , cognome , email , login " + "FROM Docente " + " ORDER BY login";
            try(PreparedStatement statement = connection.prepareStatement(sql);
                ResultSet risultato = statement.executeQuery()) {
                while(risultato.next()){
                    nome.add(risultato.getString("nome"));
                    cognome.add(risultato.getString("cognome"));
                    email.add(risultato.getString("email"));
                    login.add(risultato.getString("login"));
                }
            }
        }
    }
