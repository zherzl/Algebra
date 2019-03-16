package com.primjer15.iznimke;

public class ViseVrstiIznimki {

    public static void main(String[] args) {
        int broj = 0;
        String unos = "234d"; // Izmijeniti za drugu iznimku
        int[] polje = {1, 2, 3};
        try {
            // 1. greška
            broj = new Integer(unos);
            // 2. greška
            broj = polje[5];
            // 3. greška
            broj = broj / 0;
        } catch (NumberFormatException e) {
            System.out.println("Greška pri konverziji znakovnog niza u broj");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Greška pri pristupu elementu iz polja");
        } catch (Exception e) {
            System.out.println("Sve ostale greške.");
        }
        
        System.out.println("Završetak programa.");
    }

}
