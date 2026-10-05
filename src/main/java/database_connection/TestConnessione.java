package database_connection;

import implementazioneDao.DocentePostgresDao;
import implementazioneDao.UtentePostgresDao;
import java.sql.Connection;

public class TestConnessione {

    public static void main(String[] args) {
        try (Connection connessione =
                     ConnessioneDatabase.getconnessione()) {
            DocentePostgresDao docente = new DocentePostgresDao(connessione);

            docente.register(
                    "Francesco",
                    "Rossi",
                    "francesco@example.com",
                    "kekko",
                    "12345"
            );
            UtentePostgresDao utente = new UtentePostgresDao(connessione);

            System.out.println(utente.login("kekko", "12345"));
            System.out.println(utente.login("kekko", "1234"));
            System.out.println(utente.getTipoUtente("kekko"));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}