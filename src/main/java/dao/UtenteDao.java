package dao;

public interface UtenteDao {
    boolean login (String login , String password )throws Exception;
    String getTipoUtente(String login)throws  Exception;
}
