package com.primjer15.iznimke;

public class MojaIznimka extends Exception {

    private String korisnik;

    public MojaIznimka() {
    }

    // Konstruktor koji zaprima dodatni argument, ime korisnika koji je izazvao
    // iznimku
    public MojaIznimka(String poruka, String korisnik) {
        super(poruka);
        setKorisnik(korisnik);
    }

    public void setKorisnik(String korisnik) {
        this.korisnik = korisnik;
    }

    public String getKorisnik() {
        return this.korisnik;
    }

}
