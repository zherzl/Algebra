package com.primjer03.petlje_k_toka;

public class ForPetljaPrimjer {

    public static void main(String[] args) {
        int limit = 20; // Izračunavamo i ispisujemo faktorijele do varijable limit
        long faktorijel;
        for (int i = 1; i <= limit; i++) {
            faktorijel = 1L;
            for (int faktor = 2; faktor <= i; faktor++) {
                faktorijel *= faktor;
            }
            System.out.println(i + "! = " + faktorijel);
        }
    }

}
