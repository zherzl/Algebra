package com.zadaci.v01;

import java.util.Scanner;

public class Zadatak03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //https://en.wikipedia.org/wiki/Leap_year
        System.out.println("Upišite godinu:");
        int year = Integer.parseInt(sc.nextLine());

        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println("Year is overlapping");
        } else {
            System.out.println("Year is not overlapping");
        }
        
//        if (year % 4 == 0)
//        {
//            if (year % 100 == 0)
//            {
//                if (year % 400 == 0)
//                {
//                    System.out.println("Year is overlapping");
//                }
//                else
//                {
//                    System.out.println("Year is not overlapping");
//                }
//            }
//            else
//            {
//                System.out.println("Year is overlapping");
//            }
//        }
//        else
//        {
//            System.out.println("Year is not overlapping");
//        }
    }

}
