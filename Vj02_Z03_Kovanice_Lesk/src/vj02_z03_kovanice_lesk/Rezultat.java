/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vj02_z03_kovanice_lesk;

/**
 *
 * @author ivan
 */
public class Rezultat {
    private final int rezultat;
    private final int ostatak;

    public Rezultat(int rezultat, int ostatak) {
        this.rezultat = rezultat;
        this.ostatak = ostatak;
    }

    public int getRezultat() {
        return rezultat;
    }

    public int getOstatak() {
        return ostatak;
    }
}
