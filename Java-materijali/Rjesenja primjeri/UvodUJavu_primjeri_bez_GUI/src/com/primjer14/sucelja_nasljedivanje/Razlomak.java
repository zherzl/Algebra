package com.primjer14.sucelja_nasljedivanje;

public class Razlomak implements Comparable<Razlomak>, Runnable {

    int brojnik, nazivnik;

    public Razlomak(int x, int y) {
        this.brojnik = x;
        this.nazivnik = y;
    }

    @Override
    public String toString() {
        return brojnik + " / " + nazivnik;
    }

    // Metoda sučelja Comparable
    @Override
    public int compareTo(Razlomak drugi) {
        // Comparable će biti odrađen u dijelu s kolekcijama

        return 0;
    }

    // Metoda sučelja Runnable
    @Override
    public void run() {
        // implementacija metode run()
    }

}
