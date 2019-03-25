package com.primjer14.sucelja_nasljedivanje;

import java.util.*;

public class MainKlasa {

    public static void main(String[] args) {
        Razlomak r1 = new Razlomak(6, 3);
        System.out.println(r1);
        
        Razlomak r2 = new Razlomak(7, 2);
        System.out.println(r2);
        
        // Comparable će biti odrađen u dijelu s kolekcijama
//        List<Razlomak> razlomci = new ArrayList<>();
//        razlomci.add(r1);
//        razlomci.add(r2);
//        
//        System.out.println(razlomci);
//        Collections.sort(razlomci);
//        System.out.println(razlomci);
        
    }

}
