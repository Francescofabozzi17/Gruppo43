package model;



public class Tesi {
    private String fileTesi;
    private Statoapprovazione statoApprovazioneTesi;

    private Docente docente;
    private Studente studente;

    public Tesi(String filetesi, Statoapprovazione statoapprovazionetesi) {
        this.fileTesi = filetesi;
        this.statoApprovazioneTesi = statoapprovazionetesi;
    }

    public String getFiletesi() {
        return fileTesi;
    }

    public void setFiletesi(String filetesi) {
        this.fileTesi = filetesi;
    }

    public Statoapprovazione getStatoapprovazionetesi() {
        return statoApprovazioneTesi;
    }

    public void setStatoapprovazionetesi(Statoapprovazione statoapprovazionetesi) {
        this.statoApprovazioneTesi = statoapprovazionetesi;
    }

    public Docente getDocente() {
        return docente;
    }

    public void setDocente(Docente docente) {
        this.docente = docente;
    }

    public Studente getStudente() {
        return studente;
    }

    public void setStudente(Studente studente) {
        this.studente = studente;
    }
}
