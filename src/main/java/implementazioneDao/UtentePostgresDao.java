package implementazioneDao;

import dao.UtenteDao;

import java.sql.Connection;

public class UtentePostgresDao implements UtenteDao {
    private final Connection connection;

    public DocentePostgresDao(Connection connection){ this.connection = connection;}

    @Override
    public boolean login(String login, String password) throws Exception {
       String sql = "SELECT login , passwordhash" + "FROM Utente" + "WHERE passwordhash = password"
    }

    @Override
    public String getTipoUtente(String login) throws Exception {
        return "";
    }
}
