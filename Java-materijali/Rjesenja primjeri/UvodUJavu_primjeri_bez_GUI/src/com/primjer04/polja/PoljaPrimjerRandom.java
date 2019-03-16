package com.primjer04.polja;

public class PoljaPrimjerRandom {

    public static void main(String[] args) {
        // kako dobiti ocjenu od 1-5?
        /*
        while (true) { System.out.println((int)(Math.random() * 5) + 1); }
         */

        int[] polje = new int[5];

        for (int i = 0; i < polje.length; i++) {
            polje[i] = (int) (Math.random() * 5) + 1;
        }

        for (int broj : polje) {
            System.out.print(broj + " ");
        }
        
        System.out.println();
        System.out.println("obrnuto");
        for (int i = polje.length - 1; i >= 0; i--) {
            System.out.print(polje[i] + " ");
        }
        System.out.println();
    }

}
