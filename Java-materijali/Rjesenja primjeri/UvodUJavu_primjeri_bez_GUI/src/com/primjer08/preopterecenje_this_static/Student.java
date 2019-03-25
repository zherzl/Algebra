package com.primjer08.preopterecenje_this_static;

import java.util.ArrayList;

public class Student {

    private int brojIndeksa;
    private String ime;
    private String prezime;
    private ArrayList<String> prijavljeniIspiti = new ArrayList<String>();
    public static int counter = 0;
    
    //konstruktor klase Student
    public Student(String ime, String prezime, int brojIndeksa) {
        this.brojIndeksa = brojIndeksa;
        this.ime = ime;
        this.prezime = prezime;
        Student.counter++;
    }

    public Student() {
        this.brojIndeksa = 1;
        this.ime = "";
        this.prezime = "";
        Student.counter++;
    }

    public Student(String prezime) {
        this.brojIndeksa = 1;
        this.ime = "";
        this.prezime = prezime;
    }

}
