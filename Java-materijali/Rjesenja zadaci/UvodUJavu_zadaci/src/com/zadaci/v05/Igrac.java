
package com.zadaci.v05;


public class Igrac extends Osoba {

    int brojIgraca;
    int velicinaKopacke;

    public Igrac(int brojIgraca, int velicinaKopacke, String ime, String prezime) {
        super(ime, prezime);
        this.brojIgraca = brojIgraca;
        this.velicinaKopacke = velicinaKopacke;
    }
    
    public int getBrojIgraca() {
        return brojIgraca;
    }

    public void setBrojIgraca(int brojIgraca) {
        this.brojIgraca = brojIgraca;
    }

    public int getVelicinaKopacke() {
        return velicinaKopacke;
    }

    public void setVelicinaKopacke(int velicinaKopacke) {
        this.velicinaKopacke = velicinaKopacke;
    }

    @Override
    public String toString() {
        return "(" + this.brojIgraca + ") " + super.getIme() + " " + super.getPrezime();
    }
    
    
    
}
