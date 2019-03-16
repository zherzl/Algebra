package com.primjer15.iznimke;

public class MojaIznimkaMain {

    public static void main(String[] args) {
        try {
            double rezultat = izracunajKorijen(-1);
        } catch (MojaIznimka e) {
            System.out.println(e.getMessage());
            System.out.println("Korisnik koji je proizveo grešku: " + e.getKorisnik());
        }
    }

    public static double izracunajKorijen(double broj) throws MojaIznimka {
        if (broj < 0.0) {
            String korisnik = "Ivan";
            throw new MojaIznimka("Broj ne smije imati negativnu vrijednost", korisnik);
        }
        return Math.sqrt(broj);
    }

}
