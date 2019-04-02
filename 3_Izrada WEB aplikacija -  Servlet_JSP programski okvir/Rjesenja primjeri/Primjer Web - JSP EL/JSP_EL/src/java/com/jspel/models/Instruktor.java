package com.jspel.models;

public class Instruktor {

    private String jmbg;
    private String ime;
    private String prezime;

    public Instruktor(String ime, String prezime, String jmbg) {
        this.ime = ime;
        this.prezime = prezime;
        this.jmbg = jmbg;
    }

    public void setJmbg(String jmbg) {
        this.jmbg = jmbg;
    }

    public String getJmbg() {
        return jmbg;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getIme() {
        return ime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getPrezime() {
        return prezime;
    }

}
