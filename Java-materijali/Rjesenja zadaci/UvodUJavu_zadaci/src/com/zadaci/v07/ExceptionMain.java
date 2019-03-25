package com.zadaci.v07;

import java.util.Scanner;

public class ExceptionMain {

    public static void main(String[] args) {
        parsiranjePodataka();
    }

    private static void parsiranjePodataka() {
        String nastavak = "d";
        Scanner sc = new Scanner(System.in);

        do {
            try {
                Student s = new Student();
                System.out.println("Upišite ime i prezime:");
                s.setImePrezime(sc.nextLine());
                System.out.println("Godina studija:");
                s.setGodinaStudija(Integer.parseInt(sc.nextLine()));
                System.out.println("Prosjek ocjena:");
                s.setProsjek(Double.parseDouble(sc.nextLine()));

                if (s.getProsjek() < 1.0 || s.getProsjek() > 5.0) {
                    throw new NeispravanProsjekException("Prosjek ocjena mora biti između 1.0 i 5.0");
                }
                if (s.getGodinaStudija() < 1.0 || s.getGodinaStudija() > 5.0) {
                    throw new NeispravanProsjekException("Godina studija mora biti između 1.0 i 5.0");
                }
                System.out.println("Nastaviti? d/n");
                nastavak = sc.nextLine();

            } catch (NeispravanProsjekException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        } while (nastavak.equals("d"));
    }

}
