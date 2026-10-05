package model;

import java.util.ArrayList;

public class Tirocinio {
    private int idTirocinio;
    private String argomento;
    private Tipotirocinio tipotirocinio;
    private String referenteaziendalenome;
    private String referenteaziendaleemail;

    private Docente docente;

    private ArrayList<RichiestaTirocinio> richiestatirocinio;

    public Tirocinio(String argomento, Tipotirocinio tipotirocinio) {
        this.argomento = argomento;
        this.tipotirocinio = tipotirocinio;

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
        return docente;
    }

    public void setDocente(Docente docente) {
        this.docente = docente;
    }

    public ArrayList<RichiestaTirocinio> getRichiestatirocinio() {
        return this.richiestatirocinio;
    }

    public void setRichiestatirocinio(ArrayList<RichiestaTirocinio> richiestatirocinio) {
        this.richiestatirocinio = richiestatirocinio;
    }
}
