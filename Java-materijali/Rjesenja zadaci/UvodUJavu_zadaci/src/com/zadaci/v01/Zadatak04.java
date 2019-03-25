package com.zadaci.v01;

public class Zadatak04 {

    public static void main(String[] args) {
        int sum = 0;
        //int i = 1;
        //while (i <= 100)
        //{
        //    //sum += i;
        //    //i++;
        //    sum += i++;
        //}

        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println("Suma prvih 100 brojeva: " + sum);
    }

}
