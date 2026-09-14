package model;

import java.time.LocalDateTime;
import java.util.Date;

public class SedutaDiLaurea {
     private LocalDateTime ora;
     private Date data;
     private Studente studente;

     public SedutaDiLaurea(Date data , LocalDateTime ora , Studente studente){
         this.data = data;
         this.ora = ora;
         this.studente = studente;
     }
     public Studente getStudente(){return this.studente;}
    public void setStudente(Studente studente) {this.studente = studente;}
    public Date getData(){return this.data;}
    public void setData(Date data){this.data = data;}
    public LocalDateTime getOra(){ return this.ora; }
    public void Setora(LocalDateTime ora){this.ora = ora;}
}
