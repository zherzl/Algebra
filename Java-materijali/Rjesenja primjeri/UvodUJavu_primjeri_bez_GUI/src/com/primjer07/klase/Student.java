package com.primjer07.klase;

import java.util.*;

public class Student {

    private int brojIndeksa;

    public Student() {
    }

    public Student(int brojIndeksa, String ime, String prezime) {

        this.brojIndeksa = brojIndeksa;
        this.ime = ime;
        this.prezime = prezime;
    }

    public int getBrojIndeksa() {
        return brojIndeksa;
    }

    public void setBrojIndeksa(int brojIndeksa) {
        this.brojIndeksa = brojIndeksa;
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
    private String ime;
    private String prezime;
    private ArrayList<String> prijavljeniIspiti = new ArrayList<String>();

    //ID prijavljenog ispita ubacuje u listu
    public void prijaviIspit(String ispit) {
        prijavljeniIspiti.add(ispit);
    }

    public String dohvatiPodatke() {
        return "Ime: " + ime + "\n"
                + "Prezime: " + prezime + "\n"
                + "Broj indeksa: " + brojIndeksa + "\n"
                + "Student je prijavio sljedeće ispite: " + prijavljeniIspiti + "\n";
    }

    
}
