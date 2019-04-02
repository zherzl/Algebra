
package com.knjige.models;


public class Knjiga {
    int id, idKategorije;
    String naziv, autor;
    double cijena;

    public Knjiga(int id, int idKategorije, String naziv, String autor, double cijena) {
        this.id = id;
        this.idKategorije = idKategorije;
        this.naziv = naziv;
        this.autor = autor;
        this.cijena = cijena;
    }

    public Knjiga() {
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdKategorije() {
        return idKategorije;
    }

    public void setIdKategorije(int idKategorije) {
        this.idKategorije = idKategorije;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getCijena() {
        return cijena;
    }

    public void setCijena(double cijena) {
        this.cijena = cijena;
    }
}
