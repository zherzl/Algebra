package com.primjer18.java_tokovi;

import java.util.*;

public class Korisnik {

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
    //Radi jednostavnijeg ispisa u konzolu

    @Override
    public String toString() {
        return this.ime + " " + this.prezime;
    }

    public static List<Korisnik> dohvatiKorisnike() {
        List<Korisnik> korisnici = new ArrayList<>();
        Korisnik k1 = new Korisnik();
        k1.setId(1);
        k1.setIme("Miro");
        k1.setPrezime("Mirić");
        korisnici.add(k1);
        
        Korisnik k2 = new Korisnik();
        k2.setId(2);
        k2.setIme("Ivo");
        k2.setPrezime("Jurić");
        korisnici.add(k2);
        
        Korisnik k3 = new Korisnik();
        k3.setId(3);
        k3.setIme("Drazen");
        k3.setPrezime("Balgac");
        korisnici.add(k3);
        
        Korisnik k4 = new Korisnik();
        k4.setId(4);
        k4.setIme("Mario");
        k4.setPrezime("Balgac");
        korisnici.add(k4);

        return korisnici;
    }

}
