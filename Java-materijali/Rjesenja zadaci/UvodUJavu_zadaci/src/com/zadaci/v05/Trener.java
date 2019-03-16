package com.zadaci.v05;

class Trener extends Osoba {

    public Trener(int godineIskustvaTrenera, String ime, String prezime) {
        super(ime, prezime);
        this.godineIskustvaTrenera = godineIskustvaTrenera;
    }
    
    public int getGodineIskustvaTrenera() {
        return godineIskustvaTrenera;
    }

    public void setGodineIskustvaTrenera(int godineIskustvaTrenera) {
        this.godineIskustvaTrenera = godineIskustvaTrenera;
    }
    
    private int godineIskustvaTrenera;
    
}
