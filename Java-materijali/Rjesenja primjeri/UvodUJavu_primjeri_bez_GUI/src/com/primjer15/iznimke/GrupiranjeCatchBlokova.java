package com.primjer15.iznimke;

public class GrupiranjeCatchBlokova {

    public static void main(String[] args) {
        String unos = "234d";
        int[] polje = {1, 2, 3};

        try {
            // 1. greška
            int broj = new Integer(unos);
            // 2. greška
            broj = polje[5];
        } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Znakovni niz mora biti ispravan, a pristup poljima unutar dozvoljenog raspona.");
        }
        System.out.println("Završetak programa.");
    }

}
