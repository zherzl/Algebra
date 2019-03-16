package com.zadaci.v02;

import java.util.Scanner;

public class Zadatak01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite veličinu polja:");
        int n = Integer.parseInt(sc.nextLine());
        
        // napravimo novo polje veličine n
        int[] brojevi = new int[n];
        // pomoćno polje iste veličine
        int[] brojZnamenaka = new int[n];
        
        // Učitamo brojeve u polja
        for (int i = 0; i < brojevi.length; i++) {
            System.out.println("Upišite broj:");
            int broj = Integer.parseInt(sc.nextLine());
            brojevi[i] = broj;
        }
        
        // Zbrojimo sve znamenke iz svakog elementa i zapišemo u drugo polje
        for (int i = 0; i < n; i++) {
            int suma = 0, kopija = i;
            while (kopija > 0) {                
                // Korištenjem modulo operacije, možemo vaditi pojedine znamenke
                //int znamenka = kopija % 10; 
                suma ++;
                kopija /= 10; // Uklanjamo zadnju znamenku
            }
            // Zbroj znamenaka stavimo u novo polje
            brojZnamenaka[i] = suma; 
        }
        
        // Tražimo poziciju broja s najvećom znamenkom
        int pozicija = 0;
        for (int i = 1; i < n; i++) {
            if (brojZnamenaka[i] > brojZnamenaka[i-1]) {
                pozicija = i;
            }
        }
        
        System.out.println("Broj s najviše znamenaka: " + brojevi[pozicija]);
        
    }
}
