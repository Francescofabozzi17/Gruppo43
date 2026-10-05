package dao;


import java.util.ArrayList;

public interface StudenteDao {
    void register (String nome, String cognome, String email,String matricola ,String login , String password) throws Exception;
    void getstudente(String login, ArrayList<String> nomi, ArrayList<String> cognomi, ArrayList<String> email, ArrayList<String> matricole) throws Exception;

}
