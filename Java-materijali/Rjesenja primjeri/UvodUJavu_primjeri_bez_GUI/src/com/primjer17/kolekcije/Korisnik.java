package com.primjer17.kolekcije;

import java.util.*;

public class Korisnik implements Comparable {

    private String ime, prezime;
    private int id;

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIme() {
        return this.ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return this.prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    @Override
    public String toString() {
        return this.id + " " + this.ime + " " + this.prezime;
    }

    @Override
    public int compareTo(Object k) {
        return this.id - ((Korisnik) k).getId();
    }

    public static List<Korisnik> dohvatiKorisnike() {
        List<Korisnik> korisnici = new ArrayList<>();

        Korisnik k2 = new Korisnik();
        k2.setId(2);
        k2.setIme("Ivo");
        k2.setPrezime("Jurić");
        korisnici.add(k2);
        Korisnik k1 = new Korisnik();
        k1.setId(1);
        k1.setIme("Miro");
        k1.setPrezime("Mirić");
        korisnici.add(k1);
        Korisnik k3 = new Korisnik();
        k3.setId(3);
        k3.setIme("Miro");
        k3.setPrezime("Jurić");
        korisnici.add(k3);
        return korisnici;
    }
}
