package com.zadaci.v01;

public class Zadatak07 {

    public static void main(String[] args) {
        boolean isPrime;
        // 1 ne treba provjeravati
        for (int i = 2; i <= 100; i++) {
            // Inicijalno smatramo da je prost, 
            // pa provjeru radimo ako nije prost i prekidamo izvršavanje
            isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(i + " je prosti broj.");
            }
        }
    }

}
