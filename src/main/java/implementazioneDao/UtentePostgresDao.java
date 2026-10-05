package implementazioneDao;

import dao.UtenteDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UtentePostgresDao implements UtenteDao {
    private final Connection connection;

    public UtentePostgresDao(Connection connection) {
        this.connection = connection;
    }

    @Override
    public boolean login(String login, String password) throws Exception {
        String sql = "SELECT login " + "FROM Utente " + " WHERE login = ? AND password_hash = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, login);
            statement.setString(2, password);

            try (ResultSet risultato = statement.executeQuery()) {
                return risultato.next();

            }
        }
    }

    @Override
    public String getTipoUtente(String login) throws Exception {
        String sqlDocente = "SELECT login " + "FROM Docente  " + "Where login = ?";
        try (PreparedStatement statement = connection.prepareStatement(sqlDocente)) {
            statement.setString(1, login);

            try (ResultSet risultato = statement.executeQuery()) {
                if (risultato.next()) {
                    return "docente";
                }
            }

        }
        String sqlStudente = "SELECT login " + "FROM Studente  " + "Where login = ?";
        try (PreparedStatement statement = connection.prepareStatement(sqlStudente)) {
            statement.setString(1, login);

            try (ResultSet risultato = statement.executeQuery()) {
                if (risultato.next()) {
                    return "studente";
                }

            }

        }
        return null;
    }
}
