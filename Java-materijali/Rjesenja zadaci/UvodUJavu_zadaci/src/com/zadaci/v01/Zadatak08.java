package com.zadaci.v01;

public class Zadatak08 {

    public static void main(String[] args) {
        //1, 153, 370, 371, 407
        for (int i = 1; i <= 1000; i++) {
            int sum = 0;
            int copy = i;
            while (copy > 0) {
                sum += (int) Math.pow(copy % 10, 3);
                copy /= 10;
            }
            boolean isArmstrong = sum == i;
            
            if (isArmstrong) {
                System.out.println(i + " je armstrongov broj");
            }
        }
    }

}
