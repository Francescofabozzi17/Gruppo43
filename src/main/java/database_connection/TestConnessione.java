package database_connection;

import dao.DocenteDao;
import implementazioneDao.DocentePostgresDao;

import java.sql.Connection;
import java.util.ArrayList;

public class TestConnessione {

    public static void main(String[] args) {
        try (Connection connessione =
                     ConnessioneDatabase.getconnessione()) {

            DocenteDao docenteDao = new DocentePostgresDao(connessione);

            ArrayList<String> nomi = new ArrayList<>();
            ArrayList<String> cognomi = new ArrayList<>();
            ArrayList<String> email = new ArrayList<>();
            ArrayList<String> login = new ArrayList<>();

            docenteDao.getAllDocenti(nomi, cognomi, email, login);

            System.out.println("Query riuscita. Docenti trovati: "
                    + login.size());

            for (int i = 0; i < login.size(); i++) {
                System.out.println(
                        nomi.get(i) + " "
                                + cognomi.get(i) + " | "
                                + email.get(i) + " | "
                                + login.get(i)
                );
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}