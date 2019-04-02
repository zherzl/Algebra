package com.jdbc.models;

public class Drzava {
    int iDDrzava;
    String naziv;

    public Drzava() { }
    public Drzava(int iDDrzava, String naziv) {
        this.iDDrzava = iDDrzava;
        this.naziv = naziv;
    }
    public int getiDDrzava() {
        return iDDrzava;
    }
    public void setiDDrzava(int iDDrzava) {
        this.iDDrzava = iDDrzava;
    }
    public String getNaziv() {
        return naziv;
    }
    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }
}
