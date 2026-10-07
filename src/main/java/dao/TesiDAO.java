package dao;



import java.util.ArrayList;

public interface TesiDAO {
    void Caricatesi (int idtesi ,String fileTesi , String loginstudente , String logindocente )throws Exception;
    void getTesiPerStudente (String loginStudente , ArrayList<Integer> idtesi ,ArrayList<String> fileTesi , ArrayList<String> statocorrente ,ArrayList<String> logindocenti)throws Exception;
    void getTesiPerDocente (String loginDocente , ArrayList<Integer> idtesi ,ArrayList<String> fileTesi , ArrayList<String> statocorrente , ArrayList<String> loginstudenti ) throws Exception;
    boolean sostituisciFileTesi(int idTesi, String nuovoFileTesi)throws Exception;
    boolean aggiornastato (int idtesi , String stato)throws Exception;
}
