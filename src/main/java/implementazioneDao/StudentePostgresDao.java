package implementazioneDao;

import dao.StudenteDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;

public class StudentePostgresDao implements StudenteDao {
    private final Connection connection;

    public StudentePostgresDao(Connection connection){
        this.connection = connection;
    }
    void register (String nome, String cognome, String email,String matricola ,String login , String password) throws Exception {
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


    }
    void getstudente(String login, ArrayList<String> nomi, ArrayList<String> cognomi, ArrayList<String> email, ArrayList<String> matricole) throws Exception;
}
