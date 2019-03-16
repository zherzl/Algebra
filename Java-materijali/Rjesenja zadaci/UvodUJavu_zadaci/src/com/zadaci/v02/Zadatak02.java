package com.zadaci.v02;

import java.util.Scanner;

public class Zadatak02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("Broj predmeta:");
        n = Integer.parseInt(sc.nextLine());

        int[] ocjene = new int[n];

        int ocjena, brojUnesenih = 0;
        do {
            System.out.println("Upišite " + (brojUnesenih + 1) + ". ocjenu:");
            ocjena = Integer.parseInt(sc.nextLine());

            if (ocjena >= 1 && ocjena <= 5) {
                ocjene[brojUnesenih] = ocjena;
                brojUnesenih++;
            } else {
                System.out.println("Pogrešan unos, ponovite!");
            }
        } while (brojUnesenih < n);

        double sumaOcjena = 0;
        boolean zadovoljio = true;
        
        for (int i = 0; i < ocjene.length; i++) {
            if (ocjene[i] == 1) {
                System.out.println("Učenik nije zadovoljio");
                zadovoljio = false;
                break;
            } else {
                sumaOcjena += ocjene[i];
            }
        }
        
        if (zadovoljio) {
            System.out.println("Učenik ima prosjek: " + sumaOcjena / n);
        }
    }

}
