package com.zadaci.v01;

import java.util.Scanner;

public class Zadatak06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert number:");
        int n = Integer.parseInt(sc.nextLine());

        //6, 28, 496 - jesu
        int sum = 0;
        //for (int i = 1; i < n; i++)
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }

        if (sum == n) {
            System.out.println("Broj je savršen");
        } else {
            System.out.println("Broj nije savršen");

        }
    }

}
