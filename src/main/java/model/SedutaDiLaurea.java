package model;

import java.time.LocalDate;

import java.time.LocalTime;
import java.util.ArrayList;


public class SedutaDiLaurea {
    private int idseduta;
     private LocalDate data;
     private LocalTime ora;
     private String luogo;
     private ArrayList<Studente> studenti;

     public SedutaDiLaurea(LocalTime ora ,LocalDate data , String luogo , int idseduta){
         this.idseduta = idseduta;
         this.data = data;
         this.ora = ora;
         this.luogo = luogo;
         this.studenti = new ArrayList<>();

     }
    public int getIdseduta() {return idseduta;}


    public void setIdseduta(int idseduta) {     this.idseduta = idseduta;   }
    public ArrayList<Studente> getStudenti(){   return studenti;     }
    public void aggiungiStudente(Studente studente){
         if(!studenti.contains(studente)){
             studenti.add(studente);
         }
         studente.setSedutadilaurea(this);
    }
    public LocalDate getData(){return this.data;}
    public void setData(LocalDate data){this.data = data;}
    public LocalTime getOra(){ return this.ora; }
    public void Setora(LocalTime ora){this.ora = ora;}
    public String getLuogo() {return luogo;}
    public void setLuogo(String luogo) {this.luogo = luogo;}
}
