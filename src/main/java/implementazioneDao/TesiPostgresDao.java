package implementazioneDao;

import java.sql.Connection;
import java.util.ArrayList;

public class TesiPostgresDao {
    private final Connection connection;

    public TesiPostgresDao(Connection connection) {
        this.connection = connection;
    }

    public void Caricatesi(int idtesi, String fileTesi, String loginstudente, String logindocente) throws Exception {

    }

    public void getTesiPerStudente(String loginStudente, ArrayList<Integer> idtesi, ArrayList<String> fileTesi, ArrayList<String> statocorrente, ArrayList<String> logindocenti) throws Exception {

    }

    void getTesiPerDocente(String loginDocente, ArrayList<Integer> idtesi, ArrayList<String> fileTesi, ArrayList<String> statocorrente, ArrayList<String> loginstudenti) throws Exception {

    }

    boolean sostituisciFileTesi(int idTesi, String nuovoFileTesi) throws Exception {
        return false;
    }

    boolean aggiornastato(int idtesi, String stato) throws Exception {
        return false;
    }
}
