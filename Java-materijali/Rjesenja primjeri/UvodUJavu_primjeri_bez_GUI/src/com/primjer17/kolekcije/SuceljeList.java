package com.primjer17.kolekcije;

import java.util.*;

public class SuceljeList {

    public static void main(String[] args) {
        List<Integer> brojevi = new ArrayList<>();
        brojevi.add(5);
        brojevi.add(7);
        brojevi.add(11);
        brojevi.add(9);
        System.out.println(brojevi);
        Collections.sort(brojevi);
        System.out.println(brojevi);
        Collections.reverse(brojevi);
        System.out.println(brojevi);
        Collections.shuffle(brojevi);
        System.out.println(brojevi);
        Collections.replaceAll(brojevi, 5, 115);
        System.out.println(brojevi);
                
        comparablePrimjer();
    }

    private static void comparablePrimjer() {
        List<Korisnik> korisnici = Korisnik.dohvatiKorisnike();
        
        // Prije sortiranja
        for (Korisnik korisnik : korisnici) {
            System.out.println(korisnik);
        }
        System.out.println("----------------------");
        Collections.sort(korisnici);
        
		  // Nakon sortiranja po id-u
        for (Korisnik korisnik : korisnici) {
            System.out.println(korisnik);
        }

    }

}
