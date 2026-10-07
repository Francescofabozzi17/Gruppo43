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

            String sql = "Select id_Tirocini , argomento , tipiTirocinio , referentiAziendaliNomi ,referentiAziendaliEmail , logindocenti  "
                + " FROM tirocinio ORDER BY idTirocini";
            try (PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet risultato = statement.executeQuery() ) {
                while(risultato.next()){
                    idTirocini.add(risultato.getInt("id_Tirocini"));
                    argomenti.add(risultato.getString("argomenti"));
                    tipiTirocinio.add(risultato.getString("tipiTirocinio"));
                    referentiAziendaliNomi.add(risultato.getString("referentiAziendaliNomi"));
                    referentiAziendaliEmail.add(risultato.getString("referentiAziendaliEmail"));
                    loginDocenti.add(risultato.getString("loginDocenti"));
                }
            }
    }

        @Override
        public void getTirocinioPerDocente(String loginDocente, ArrayList<Integer> idTirocini, ArrayList<String> argomenti, ArrayList<String> tipiTirocinio, ArrayList<String> referentiAziendaliNomi, ArrayList<String> referentiAziendaliEmail) throws Exception {


            String sql = "SELECT id_Tirocini , argomenti , tipiTirocinio , referentiAziendaliNomi ,referentiAziendaliEmail "
                    + " FROM tirocinio " + "Where loginDocente = ? ORDER BY idtirocini ";
            try(PreparedStatement statement = connection.prepareStatement(sql)){
                statement.setString(1 ,loginDocente) ;

            try (ResultSet risultato = statement.executeQuery()){
                 while (risultato.next()){
                     idTirocini.add(risultato.getInt("id_Tirocini"));
                     argomenti.add(risultato.getString("argomenti"));
                     tipiTirocinio.add(risultato.getString("tipiTirocinio"));
                     referentiAziendaliNomi.add(risultato.getString("referentiAziendaliNomi"));
                     referentiAziendaliEmail.add(risultato.getString("referentiAziendaliEmail"));
                 }
               }
            }
        }

        @Override
        public void getTirociniInCorsoPerDocente(String loginDocente, ArrayList<Integer> idTirocini, ArrayList<String> argomenti, ArrayList<String> loginStudenti, ArrayList<String> nomiStudenti, ArrayList<String> cognomiStudenti) throws Exception {
            throw new UnsupportedOperationException(
                    "Metodo getTirociniInCorsoPerDocente da completare");
        }


    }



