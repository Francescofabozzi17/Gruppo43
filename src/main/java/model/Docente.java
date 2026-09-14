package model;

import java.util.ArrayList;

public class Docente extends Utente{
    private String nome;
    private String cognome;
    private String email;


    private ArrayList<Tirocinio> tirocinioassociati;

    private ArrayList<RichiestaTirocinio> richiestaTirociniovalutate;

    private ArrayList<Tesi> tesicontrollate;

    public Docente(String nome, String cognome, String email, String login , String password){
         super(login , password );
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
        this.tirocinioassociati = new ArrayList<>();
        this.richiestaTirociniovalutate = new ArrayList<>();
        this.tesicontrollate = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }



    public ArrayList<Tirocinio> getTirocinioassociati() {
        return tirocinioassociati;
    }
    public void addTirocinio(Tirocinio tirocinio){
        this.tirocinioassociati.add(tirocinio);
    }

    public void setTirocinioassociati(ArrayList<Tirocinio> tirocinioassociati) {
        this.tirocinioassociati = tirocinioassociati;
    }

    public ArrayList<RichiestaTirocinio> getRichiestaTirociniovalutate() {
        return richiestaTirociniovalutate;
    }
    public void addRichiestatirocinio (RichiestaTirocinio richiestaTirocinio){
        this.richiestaTirociniovalutate.add(richiestaTirocinio);
    }

    public void setRichiestaTirociniovalutate(ArrayList<RichiestaTirocinio> richiestaTirociniovalutate) {
        this.richiestaTirociniovalutate = richiestaTirociniovalutate;
    }

    public ArrayList<Tesi> getTesicontrollate() {
        return tesicontrollate;
    }
    public void addTesicontrollate(Tesi tesi){
        this.tesicontrollate.add(tesi);
    }

    public void setTesicontrollate(ArrayList<Tesi> tesicontrollate) {
        this.tesicontrollate = tesicontrollate;
    }
}
