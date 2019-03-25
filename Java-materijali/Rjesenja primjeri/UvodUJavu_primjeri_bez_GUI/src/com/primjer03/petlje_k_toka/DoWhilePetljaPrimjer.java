
package com.primjer03.petlje_k_toka;

public class DoWhilePetljaPrimjer {

    public static void main(String[] args) {
        int limit = 20; // Računamo sumu brojeva od 1 do limit, uključujući i limit
        int suma = 0;
        int i = 1;
        do {
            suma += i;
            i++;
        } while (i <= limit);
        System.out.println("Suma = " + suma);
        
        doubleForExample();
    }

    private static void doubleForExample() {
        for (int redak = 1; redak <= 10; redak++) {
            for (int stupac = 1; stupac <= 10; stupac++) {
                System.out.print(redak * stupac + "\t");
            }
            System.out.println();
        }
    }
}
