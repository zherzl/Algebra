/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author LH
 */
public class Drzava extends BaseModel {

    private String nazivHrKratki;
    private String nazivHrPuni;
    private String nazivEnKratki;

    public String getNazivHrKratki() {
        return nazivHrKratki;
    }

    public void setNazivHrKratki(String nazivHrKratki) throws Exception {

        if (nazivHrKratki.trim().length() < 3) {
            throw new Exception("Država mora imati barem 3 znaka");
        }
        
        this.nazivHrKratki = nazivHrKratki;
    }

    public String getNazivHrPuni() {
        return nazivHrPuni;
    }

    public void setNazivHrPuni(String nazivHrPuni) {
        this.nazivHrPuni = nazivHrPuni;
    }

    public String getNazivEnKratki() {
        return nazivEnKratki;
    }

    public void setNazivEnKratki(String nazivEnKratki) {
        this.nazivEnKratki = nazivEnKratki;
    }

}
