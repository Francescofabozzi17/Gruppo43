package dao;




import java.util.ArrayList;



public interface RichiestatirocinioDao {
    void creaRichiesta (int idtirocinio , String loginStudente , int idRichiesta) throws Exception;
    void getRichiestePerStudente(String loginStudente, ArrayList<Integer> idRichiesta, ArrayList<String> argomenti, ArrayList<String> stati) throws Exception;
    void getRichiestePerDocente (String loginDocente , ArrayList<Integer> idRichieste, ArrayList<String> loginStudenti, ArrayList<String> argomenti, ArrayList<String> stati) throws Exception;



    boolean aggiornaStatoRichiesta(int idRichiesta, String stato) throws Exception;
}
