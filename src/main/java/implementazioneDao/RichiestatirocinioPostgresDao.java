package implementazioneDao;

import dao.RichiestatirocinioDao;

import java.sql.Connection;
import java.util.ArrayList;

public class RichiestatirocinioPostgresDao implements RichiestatirocinioDao {
    private final Connection connection;

    public RichiestatirocinioPostgresDao(Connection connection) {
        this.connection = connection;
    }
    @Override
    public void creaRichiesta (int idtirocinio , String loginStudente , int idRichiesta) throws Exception{

    }
    public void getRichiestePerStudente(String loginStudente, ArrayList<Integer> idRichiesta, ArrayList<String> argomenti, ArrayList<String> stati) throws Exception;
    public void  getRichiestePerDocente (String loginDocente , ArrayList<Integer> idRichieste, ArrayList<String> loginStudenti, ArrayList<String> argomenti, ArrayList<String> stati) throws Exception;



    public boolean  aggiornaStatoRichiesta(int idRichiesta, String stato) throws Exception;
}
