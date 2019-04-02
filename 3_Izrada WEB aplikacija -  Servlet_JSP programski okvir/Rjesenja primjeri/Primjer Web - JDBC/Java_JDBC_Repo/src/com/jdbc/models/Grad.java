package com.jdbc.models;

public class Grad {
    int iDGrad, drzavaId;
    String naziv;

    public int getiDGrad() {
        return iDGrad;
    }

    public void setiDGrad(int iDGrad) {
        this.iDGrad = iDGrad;
    }

    public int getDrzavaId() {
        return drzavaId;
    }

    public void setDrzavaId(int drzavaId) {
        this.drzavaId = drzavaId;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }
}
