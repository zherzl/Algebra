package com.zadaci.v01;

import java.util.Scanner;

public class Zadatak02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Upišite prvi broj");
        double a = sc.nextDouble();

        System.out.println("Upišite drugi broj");
        double b = sc.nextDouble();
        
        sc.nextLine(); // newline consume 
        
        System.out.println("Upišite operaciju (+,-,/,*):");
        String op = sc.nextLine();
        
        //sw + tab
        switch (op) {
            case "+":
                System.out.printf("%f %s %f = %f\n", a, op, b, a + b);
                break;
            case "-":
                System.out.printf("%f %s %f = %f\n", a, op, b, a - b);
                break;
            case "*":
                System.out.printf("%f %s %f = %f\n", a, op, b, a * b);
                break;
            case "/":
                System.out.printf("%f %s %f = %f\n", a, op, b, a / b);
                break;
            default:
                System.out.printf("Kriva operacija!");
                break;
        }

    }
}
