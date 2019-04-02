package com.beans.example;

public class StudentBean {

    private String ime;
    private String prezime;
    private int godinaStudija;
    private String matBroj;

    // ime
    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getIme() {
        return ime;
    }

    // prezime
    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getPrezime() {
        return prezime;
    }

    // godinaStudija
    public void setGodinaStudija(int godinaStudija) {
        this.godinaStudija = godinaStudija;
    }

    public int getGodinaStudija() {
        return godinaStudija;
    }

    // matični broj
    public void setMatBroj(String matBroj) {
        this.matBroj = matBroj;
    }

    public String getMatBroj() {
        return matBroj;
    }

}
