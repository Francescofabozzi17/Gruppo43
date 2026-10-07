package model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Tirocinio {
    private int idTirocinio;
    private String argomento;
    private Tipotirocinio tipotirocinio;
    private String referenteaziendalenome;
    private String referenteaziendaleemail;
    private LocalDate data_scadenza;

    private Docente logindocente;

    private ArrayList<RichiestaTirocinio> richiestatirocinio;

    public Tirocinio(String argomento, Tipotirocinio tipotirocinio , LocalDate data_scadenza) {
        this.argomento = argomento;
        this.tipotirocinio = tipotirocinio;
        this.data_scadenza = data_scadenza;

        this.richiestatirocinio = new ArrayList<>();
    }

    public int getIdTirocinio() {return idTirocinio;}

    public void setIdTirocinio(int idTirocinio) {this.idTirocinio = idTirocinio;}
    public String getArgomento() {
        return argomento;
    }

    public void setArgomento(String argomento) {
        this.argomento = argomento;
    }

    public Tipotirocinio getTipotirocinio() {
        return tipotirocinio;
    }

    public void setTipotirocinio(Tipotirocinio tipotirocinio) {
        this.tipotirocinio = tipotirocinio;
    }

    public String getReferenteaziendalenome() {
        return referenteaziendalenome;
    }

    public void setReferenteaziendalenome(String referenteaziendalenome) {
        this.referenteaziendalenome = referenteaziendalenome;
    }

    public String getReferenteaziendaleemail() {
        return referenteaziendaleemail;
    }

    public void setReferenteaziendaleemail(String referenteaziendaleemail) {
        this.referenteaziendaleemail = referenteaziendaleemail;
    }

    public Docente getDocente() {
        return logindocente;
    }

    public void setDocente(Docente docente) {
        this.logindocente = docente;
    }

    public ArrayList<RichiestaTirocinio> getRichiestatirocinio() {
        return this.richiestatirocinio;
    }

    public void setRichiestatirocinio(ArrayList<RichiestaTirocinio> richiestatirocinio) {
        this.richiestatirocinio = richiestatirocinio;
    }
    public LocalDate getDataScadenza(){
return this.data_scadenza;
    }
    public void setData_scadenza(LocalDate data_scadenza){
        this.data_scadenza = data_scadenza;
    }
}
