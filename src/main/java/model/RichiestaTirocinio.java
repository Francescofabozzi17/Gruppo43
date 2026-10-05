package model;

public class RichiestaTirocinio {
    private int idrichiesta;
    private Studente studente;
    private Tirocinio tirocinio;
    private Statoapprovazione statoapprovazione;



    public RichiestaTirocinio(Studente studente, Tirocinio tirocinio, Statoapprovazione statoapprovazione) {
        this.studente = studente;
        this.tirocinio = tirocinio;
        this.statoapprovazione = statoapprovazione;
    }
    public int getIdrichiesta() {return idrichiesta;}

    public void setIdrichiesta(int idrichiesta   ) {this.idrichiesta = idrichiesta;}
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
        return tirocinio.getDocente();
    }
}


