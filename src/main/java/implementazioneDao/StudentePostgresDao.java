package implementazioneDao;

import dao.StudenteDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class StudentePostgresDao implements StudenteDao {
    private final Connection connection;

    public StudentePostgresDao(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void register(String nome, String cognome, String email, String matricola, String login, String password) throws Exception {
        String sqlUtente = "INSERT INTO Utente (login , password_hash) VALUES (? , ?)";
        String sqlStudente = "INSERT INTO Utente (matricola , nome , cognome , email ,) VALUES (? , ? , ? , ?)";
        if (!connection.getAutoCommit()) {
            System.out.println("Una transazione è gia in corso");
        }
        connection.setAutoCommit(false);
        try {
            try (PreparedStatement statement =
                         connection.prepareStatement(sqlUtente)) {

                statement.setString(1, login);
                statement.setString(2, password);
                statement.executeUpdate();
            }
            try (PreparedStatement statement =
                         connection.prepareStatement(sqlStudente)) {

                statement.setString(1, matricola);
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


    public void getstudente(String login, ArrayList<String> nome, ArrayList<String> cognome, ArrayList<String> email, ArrayList<String> matricola) throws Exception {

        String sql = "SELECT nome, cognome, email, matricola " + "FROM Studente" + " WHERE login = ?";

        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, login);
            try (ResultSet risultato = statement.executeQuery()) {
                if (risultato.next()) {
                    nome.add(risultato.getString("nome"));
                    cognome.add(risultato.getString("cognome"));
                    email.add(risultato.getString("email"));
                    matricola.add(risultato.getString("matricola"));
                }
            }
        }
    }
}