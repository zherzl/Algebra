package com.jdbc.models;

public class Kupac {
    int iDKupac, idGrad;
    String ime, prezime, email;
    public Kupac() { }
    public Kupac(int iDKupac, String ime, String prezime, String email) {
        this.iDKupac = iDKupac;
        this.ime = ime;
        this.prezime = prezime;
        this.email = email;
    }
    public int getIdGrad() { return idGrad; }
    public void setIdGrad(int idGrad) { this.idGrad = idGrad; }
    public int getiDKupac() { return iDKupac; }
    public void setiDKupac(int iDKupac) { this.iDKupac = iDKupac; }
    public String getIme() { return ime; }
    public void setIme(String ime) { this.ime = ime; }
    public String getPunoImePrezime() { return ime + " " + prezime; }
    public String getPrezime() { return prezime; }
    public void setPrezime(String prezime) { this.prezime = prezime; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
}
