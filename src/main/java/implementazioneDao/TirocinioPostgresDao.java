package implementazioneDao;

import dao.TirocinioDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


    public class TirocinioPostgresDao implements TirocinioDao {
    private final Connection connection;

    public TirocinioPostgresDao(Connection connection){
        this.connection = connection;
    }
    @Override
    public void inseriscitirocinio( String argomento, String tipoTirocinio, String referente_Aziendale_Nome, String referente_Aziendale_Email, String login_Docente) throws Exception {
        String sql = " INSERT INTO Tirocinio" + " (argomento, tipo, referente_Aziendale_Nome, referente_Aziendale_Email, login_Docente)"
         +" VALUES (?, CAST(? AS tipo_tirocinio), ?, ?, ?)";

        try(PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, argomento);
            statement.setString(2, tipoTirocinio);
            statement.setString(3, referente_Aziendale_Nome);
            statement.setString(4 , referente_Aziendale_Email);
            statement.setString(5 , login_Docente);

            statement.executeUpdate();
        }
    }

        @Override
        public void getTirocinioDisponibili(ArrayList<Integer> idTirocini, ArrayList<String> argomenti, ArrayList<String> tipiTirocinio, ArrayList<String> referentiAziendaliNomi, ArrayList<String> referentiAziendaliEmail, ArrayList<String> loginDocenti) throws Exception {

            String sql = "Select id_Tirocinio , argomento , tipiTirocinio , referentiAziendaliNomi ,referentiAziendaliEmail , logindocente  "
                + " FROM tirocinio ORDER BY idTirocini";
            try (PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet risultato = statement.executeQuery() ) {
                while(risultato.next()){
                    idTirocini.add(risultato.getInt("id_Tirocinio"));
                    argomenti.add(risultato.getString("argomento"));
                    tipiTirocinio.add(risultato.getString("tipoTirocinio"));
                    referentiAziendaliNomi.add(risultato.getString("referenteAziendaliNomi"));
                    referentiAziendaliEmail.add(risultato.getString("referenteAziendaliEmail"));
                    loginDocenti.add(risultato.getString("loginDocente"));
                }
            }
    }

        @Override
        public void getTirocinioPerDocente(String loginDocente, ArrayList<Integer> idTirocini, ArrayList<String> argomenti, ArrayList<String> tipiTirocinio, ArrayList<String> referentiAziendaliNomi, ArrayList<String> referentiAziendaliEmail) throws Exception {


            String sql = "SELECT id_Tirocinio , argomento , tipoTirocinio , referenteAziendaliNomi ,referenteAziendaliEmail "
                    + " FROM tirocinio " + "Where loginDocente = ? ORDER BY idtirocini ";
            try(PreparedStatement statement = connection.prepareStatement(sql)){
                statement.setString(1 ,loginDocente) ;

            try (ResultSet risultato = statement.executeQuery()){
                 while (risultato.next()){
                     idTirocini.add(risultato.getInt("id_Tirocinio"));
                     argomenti.add(risultato.getString("argomento"));
                     tipiTirocinio.add(risultato.getString("tipoTirocinio"));
                     referentiAziendaliNomi.add(risultato.getString("referenteAziendaliNomi"));
                     referentiAziendaliEmail.add(risultato.getString("referenteAziendaliEmail"));
                 }
               }
            }
        }

        @Override
        public void getTirociniInCorsoPes65 asw3rDocente(String loginDocente, ArrayList<Integer> idTirocini, ArrayList<String> argomenti, ArrayList<String> loginStudenti, ArrayList<String> nomiStudenti, ArrayList<String> cognomiStudenti) throws Exception {
            throw new UnsupportedOperationException(
                    "Metodo getTirociniInCorsoPerDocente da completare");
        }


    }



