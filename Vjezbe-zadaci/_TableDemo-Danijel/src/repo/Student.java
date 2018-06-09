/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repo;

/**
 *
 * @author danijel.kucak
 */
public class Student {

    private String jmbag;
    private int godina;
    private boolean redovni;
    private float prosjek;
    private String prezime;

    public Student(String jmbag, int godina, boolean redovni, float prosjek, String prezime) {
        this.jmbag = jmbag;
        this.godina = godina;
        this.redovni = redovni;
        this.prosjek = prosjek;
        this.prezime = prezime;

    }

    /**
     * @return the jmbag
     */
    public String getJmbag() {
        return jmbag;
    }

    /**
     * @param jmbag the jmbag to set
     */
    public void setJmbag(String jmbag) {
        this.jmbag = jmbag;
    }

    /**
     * @return the godina
     */
    public int getGodina() {
        return godina;
    }

    /**
     * @param godina the godina to set
     */
    public void setGodina(int godina) {
        this.godina = godina;
    }

    /**
     * @return the redovni
     */
    public boolean isRedovni() {
        return redovni;
    }

    /**
     * @param redovni the redovni to set
     */
    public void setRedovni(boolean redovni) {
        this.redovni = redovni;
    }

    /**
     * @return the prosjek
     */
    public float getProsjek() {
        return prosjek;
    }

    /**
     * @param prosjek the prosjek to set
     */
    public void setProsjek(float prosjek) {
        this.prosjek = prosjek;
    }

    /**
     * @return the prezime
     */
    public String getPrezime() {
        return prezime;
    }

    /**
     * @param prezime the prezime to set
     */
    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

}
