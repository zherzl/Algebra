package com.zadaci.v03;

import java.util.Scanner;

public class Zadatak01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String imePrezime, gradRodenja;
        boolean ponoviUnos;

        do {
            ponoviUnos = false;
            System.out.println("Upišite ime i prezime:");
            imePrezime = sc.nextLine().trim();

            System.out.println("Upišite grad rođenja:");
            gradRodenja = sc.nextLine();

            String[] imePrezimeOdvojeno = imePrezime.split(" ");
            if (imePrezimeOdvojeno[0].length() > 7) {
                System.out.println("Ime ima više od 7 znakova");
                ponoviUnos = true;
                continue;
            }

            System.out.println("upisali ste ime: " + imePrezimeOdvojeno[0]);
            System.out.println("upisali ste prezime: " + imePrezimeOdvojeno[1]);

            if (gradRodenja.toLowerCase().indexOf("a") >= 0) {
                System.out.println("grad ima samoglasnik a");
            }
            if (gradRodenja.toLowerCase().indexOf("e") >= 0) {
                System.out.println("grad ima samoglasnik e");
            }
            if (gradRodenja.toLowerCase().indexOf("i") >= 0) {
                System.out.println("grad ima samoglasnik i");
            }
            if (gradRodenja.toLowerCase().indexOf("o") >= 0) {
                System.out.println("grad ima samoglasnik o");
            }
            if (gradRodenja.toLowerCase().indexOf("u") >= 0) {
                System.out.println("grad ima samoglasnik u");
            }
        } while (ponoviUnos);

    }

}
