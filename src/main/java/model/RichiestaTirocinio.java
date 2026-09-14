package model;

public class RichiestaTirocinio {
    private Studente studente;
    private Tirocinio tirocinio;
    private Statoapprovazione statoapprovazione;

    private Docente docenterelatore;

    public RichiestaTirocinio(Studente studente, Tirocinio tirocinio, Statoapprovazione statoapprovazione) {
        this.studente = studente;
        this.tirocinio = tirocinio;
        this.statoapprovazione = statoapprovazione;
    }

    public Studente getStudente() {
        return studente;
    }

    public void setStudente(Studente studente) {
        this.studente = studente;
    }

    public Tirocinio getTirocinio() {
        return tirocinio;
    }

    public void setTirocinio(Tirocinio tirocinio) {
        this.tirocinio = tirocinio;
    }

    public Statoapprovazione getStatoapprovazione() {
        return this.statoapprovazione;
    }

    public void setStatoapprovazione(Statoapprovazione statoapprovazione) {this.statoapprovazione = statoapprovazione;}

    public Docente getDocenterelatore() {
        return docenterelatore;
    }

    public void setDocenterelatore(Docente docenterelatore) {
        this.docenterelatore = docenterelatore;
    }
}
