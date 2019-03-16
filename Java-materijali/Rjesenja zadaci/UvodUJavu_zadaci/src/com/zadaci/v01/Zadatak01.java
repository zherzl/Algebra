package com.zadaci.v01;

import java.util.Scanner;

public class Zadatak01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Upišite prvi broj");
        int a = sc.nextInt();

        System.out.println("Upišite drugi broj");
        int b = sc.nextInt();

        System.out.println(a + " + " + b + " = " + (a + b));
        System.out.println(a + " * " + b + " = " + a * b);
    }

}
