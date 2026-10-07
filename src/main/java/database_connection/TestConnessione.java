package database_connection;

import dao.StudenteDao;
import implementazioneDao.DocentePostgresDao;
import implementazioneDao.StudentePostgresDao;
import implementazioneDao.TirocinioPostgresDao;
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
            if (nomi.isEmpty()) {
                System.out.println("Studente non trovato");
            } else {
                System.out.println(nomi.get(0) + " " + cognomi.get(0));
                System.out.println("Matricola: " + matricole.get(0));
            }
            TirocinioPostgresDao tirocinio = new TirocinioPostgresDao(connessione);
            String argomento = "matematica";
            tirocinio.inseriscitirocinio(argomento ,"INTERNO" , null , null, "kekko");
            System.out.println("Tirocinio di " + argomento + " inserito correttamente");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}