package com.primjer01.cast;

public class CastPrimjer {

    public static void main(String[] args) {
        byte b = 127;
        //b = b + 1; // ne ide
        //b = (byte)(b + 1);
        System.out.println(b++);

        // implicit cast
        int i = b;
        double d = 2.5;
        // explicit cast
        short x = (short) i;
        System.out.println(x);
        float f = 2.3f; // 2.3 je double

        int mat = 3;
        int hrv = 5;
        int prg = 4;
        double brojPredmeta = 3;
        double prosjek = (mat + hrv + prg) / brojPredmeta;
        System.out.println("Prosjek ocjena je: " + prosjek);
    }

}
