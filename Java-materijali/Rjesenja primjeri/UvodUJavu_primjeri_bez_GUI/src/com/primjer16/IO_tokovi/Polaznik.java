package com.primjer16.IO_tokovi;

class Polaznik {

    String ime, prezime;
    int godina;

    public Polaznik(String ime, String prezime, int godina) {
        this.ime = ime;
        this.prezime = prezime;
        this.godina = godina;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public int getGodina() {
        return godina;
    }

    public void setGodina(int godina) {
        this.godina = godina;
    }

    @Override
    public String toString() {
        return ime + " " + prezime + " " + godina;
    }
    
    
}
