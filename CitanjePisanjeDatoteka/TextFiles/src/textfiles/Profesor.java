/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textfiles;

/**
 *
 * @author Zlatko
 */
class Profesor {

    /**
     * @return the ime
     */
    public String getIme() {
        return ime;
    }

    /**
     * @param ime the ime to set
     */
    public void setIme(String ime) {
        this.ime = ime;
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

    /**
     * @return the brojKolegija
     */
    public int getBrojKolegija() {
        return brojKolegija;
    }

    /**
     * @param brojKolegija the brojKolegija to set
     */
    public void setBrojKolegija(int brojKolegija) {
        this.brojKolegija = brojKolegija;
    }
    private String ime;
    private String prezime;
    private int brojKolegija;

    @Override
    public String toString() {
        return this.getIme() + '|' + this.getPrezime() + '|' + this.getBrojKolegija() + '\n';
    }
    
    
}
