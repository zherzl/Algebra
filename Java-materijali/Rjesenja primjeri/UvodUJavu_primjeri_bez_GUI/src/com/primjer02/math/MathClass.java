package com.primjer02.math;

public class MathClass {

    public static void main(String[] args) {
        //E i round()
        System.out.println("e = " + Math.round(Math.E * 100) / 100f);
        //PI
        System.out.println("pi = " + Math.round(Math.PI * 100) / 100f);
        //pow() – izračunavanje 103
        System.out.println("Potencija = " + Math.pow(10, 3));
        //round() – E zaokruzen na cijeli broj
        System.out.println("Zaokruženo = " + Math.round(Math.E));
        //sqrt() – korijen od 400
        System.out.println("Korijen = " + Math.sqrt(400));
    }

}
