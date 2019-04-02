package com.jspel.models;

public class Student {

    private String ime;
    private String prezime;
    private Instruktor instruktor;

    public Student(String ime, String prezime, Instruktor instr) {
        this.ime = ime;
        this.prezime = prezime;
        this.instruktor = instr;
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

    public void setInstruktor(Instruktor instruktor) {
        this.instruktor = instruktor;
    }

    public Instruktor getInstruktor() {
        return instruktor;
    }

}
