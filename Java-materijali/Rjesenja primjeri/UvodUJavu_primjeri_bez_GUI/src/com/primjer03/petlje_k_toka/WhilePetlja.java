package com.primjer03.petlje_k_toka;

public class WhilePetlja {
    // Pokretanje iz "dist" foldera
    //java -jar UvodUJavu_primjeri.jar 150
    public static void main(String[] args) {
        int broj = Integer.parseInt(args[0]);
        int zbrojZnamenaka = 0;
        int zadnjaZnamenka;
        
        System.out.println("Zbroj znamenaka broja " + broj + " je: ");
        
        while (broj > 0) {            
            zadnjaZnamenka = broj % 10;
            zbrojZnamenaka += zadnjaZnamenka;
            broj /= 10;
        }
        
        System.out.println(zbrojZnamenaka);
    }

}
