package dao;



import java.time.LocalDate;

import java.time.LocalTime;
import java.util.ArrayList;


public interface SedutadilaureaDAO {
    void inserisciseduta(int idseduta , LocalTime ora , LocalDate data, String luogo ) throws Exception;
    void getsedutedisponibili (ArrayList<Integer> idseduta , ArrayList <String> luogo , ArrayList<LocalDate> data , ArrayList<LocalTime> ora)throws Exception;
    void getStudentiPerSeduta (int idSeduta , ArrayList<String> matricole , ArrayList<String> nomi , ArrayList<String> cognomi , ArrayList<String> loginstudenti )throws Exception;

    boolean prenotastudente (String loginStudente , int idSeduta)throws Exception;

}
