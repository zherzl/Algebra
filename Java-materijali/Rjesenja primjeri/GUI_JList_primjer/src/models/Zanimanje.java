
package models;


public class Zanimanje {
    private int id;

    public Zanimanje(int id, String naziv) {
        this.id = id;
        this.naziv = naziv;
    }
    private String naziv;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    @Override
    public String toString() {
        return this.id + " - " + this.naziv;
    }
    
    
}
