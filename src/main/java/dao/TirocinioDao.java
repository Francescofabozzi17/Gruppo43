package dao;



import java.util.ArrayList;

public interface TirocinioDao {
    void inseriscitirocinio(int idTirocinio, String argomento, String tipoTirocinio, String referenteAziendaleNome, String referenteAziendaleEmail, String loginDocente) throws Exception;
    void getTirocinioDisponibili(ArrayList<Integer> idTirocini, ArrayList<String> argomenti, ArrayList<String> tipiTirocinio, ArrayList<String> referentiAziendaliNomi, ArrayList<String> referentiAziendaliEmail, ArrayList<String> loginDocenti) throws Exception;
    void getTirocinioPerDocente(String loginDocente, ArrayList<Integer> idTirocini, ArrayList<String> argomenti, ArrayList<String> tipiTirocinio, ArrayList<String> referentiAziendaliNomi, ArrayList<String> referentiAziendaliEmail) throws Exception;
    void getTirociniInCorsoPerDocente(
            String loginDocente, ArrayList<Integer> idTirocini, ArrayList<String> argomenti, ArrayList<String> loginStudenti, ArrayList<String> nomiStudenti, ArrayList<String> cognomiStudenti) throws Exception;
}
