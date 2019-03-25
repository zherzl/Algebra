
package com.zadaci.v09.models;

import java.util.ArrayList;
import java.util.List;


public class Student {
    private int id, godinaStudija;

    public int getGodinaStudija() {
        return godinaStudija;
    }

    public void setGodinaStudija(int godinaStudija) {
        this.godinaStudija = godinaStudija;
    }
    private String name, lastName, smjer;
    public List<Course> upisaniKolegiji;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSmjer() {
        return smjer;
    }

    public void setSmjer(String smjer) {
        this.smjer = smjer;
    }

    public Student(int id, String name, String lastName, String smjer, int godinaStudija) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.smjer = smjer;
        this.godinaStudija = godinaStudija;
        this.upisaniKolegiji = new ArrayList<>();
    }
    
    public Student(int id, String name, String lastName, String smjer, int godinaStudija, List<Course> upisaniKolegiji) {
        this(id, name, lastName, smjer, godinaStudija);
        this.upisaniKolegiji = upisaniKolegiji;
    }
}
