package com.zadaci.v01;

import java.util.Scanner;

public class Zadatak05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Upišite broj");
        int broj = Integer.parseInt(sc.nextLine());
        
        long fakt = 1;
        
        for (long i = 1; i <= broj; i++) {
            fakt *= i;
        }
        
        System.out.println(broj +  "! = " + fakt);
    }

}
