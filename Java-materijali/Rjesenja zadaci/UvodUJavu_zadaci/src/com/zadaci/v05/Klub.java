package com.zadaci.v05;

class Klub {

    private int iDKluba;
    private String naziv;
    private String grad;
    private static int idCount = 1;
    private final Trener trener;

    public Trener getTrener() {
        return trener;
    }

    public int getiDKluba() {
        return iDKluba;
    }

    public void setiDKluba(int iDKluba) {
        this.iDKluba = iDKluba;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getGrad() {
        return grad;
    }

    public void setGrad(String grad) {
        this.grad = grad;
    }

    public static int getIdCount() {
        return idCount;
    }

    public static void setIdCount(int idCount) {
        Klub.idCount = idCount;
    }

    public Klub(String naziv, String grad, Trener trener) {
        this.naziv = naziv;
        this.iDKluba = idCount;
        this.grad = grad;
        this.trener = trener;
        idCount++;
    }
}
