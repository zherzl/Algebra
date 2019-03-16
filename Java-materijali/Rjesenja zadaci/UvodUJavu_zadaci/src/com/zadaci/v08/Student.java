
package com.zadaci.v08;


public class Student {
    private String imePrezime;
    private int godinaStudija;
    private double prosjek;

    public String getImePrezime() {
        return imePrezime;
    }

    public void setImePrezime(String imePrezime) {
        this.imePrezime = imePrezime;
    }

    public int getGodinaStudija() {
        return godinaStudija;
    }

    public void setGodinaStudija(int godinaStudija) {
        this.godinaStudija = godinaStudija;
    }

    public double getProsjek() {
        return prosjek;
    }

    public void setProsjek(double prosjek) {
        this.prosjek = prosjek;
    }

    @Override
    public String toString() {
        return "Ime i prezime: " + imePrezime + " godina studija: " + godinaStudija + " prosjek: " + prosjek;
    }
    
    
}
