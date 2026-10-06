package database_connection;

import dao.StudenteDao;
import implementazioneDao.DocentePostgresDao;
import implementazioneDao.StudentePostgresDao;
import implementazioneDao.UtentePostgresDao;
import model.Studente;

import java.sql.Connection;
import java.util.ArrayList;

public class TestConnessione {

    public static void main(String[] args) {
        try (Connection connessione =
                     ConnessioneDatabase.getconnessione()) {
           /* DocentePostgresDao docente = new DocentePostgresDao(connessione);

             docente.register(
                    "Francesco",
                    "Rossi",
                    "francesco@example.com",
                    "kekko",
                    "12345"
            );
            UtentePostgresDao utente = new UtentePostgresDao(connessione);*/
            StudentePostgresDao studente = new StudentePostgresDao(connessione);

            /*System.out.println(utente.login("kekko", "12345"));
            System.out.println(utente.login("kekko", "1234"));
            System.out.println(utente.getTipoUtente("kekko"));*/
            ArrayList<String> nomi = new ArrayList<>();
            ArrayList<String> cognomi = new ArrayList<>();
            ArrayList<String> email = new ArrayList<>();
            ArrayList<String> matricole = new ArrayList<>();
            studente.getstudente("123" , nomi , cognomi , email , matricole);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}