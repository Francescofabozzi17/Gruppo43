package dao;



import java.util.ArrayList;


public interface DocenteDao {
    void register (String nome, String cognome, String email, String login , String password) throws Exception;
    void getDocente (String login ,ArrayList<String> nome, ArrayList<String> cognome, ArrayList<String> email ) throws Exception;
    void getAllDocenti(ArrayList<String> nome, ArrayList<String> cognome, ArrayList<String> email , ArrayList<String> login) throws Exception;
}
