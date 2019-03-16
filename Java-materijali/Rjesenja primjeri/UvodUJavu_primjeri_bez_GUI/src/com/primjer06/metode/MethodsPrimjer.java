package com.primjer06.metode;

public class MethodsPrimjer {

   
    public static void main(String[] args) {
        ispisiHello();
        String s = "pero";
        ispisi(s);
        // primjer "overloadanja" (preopterećenja) metode
        int i = 5;
        ispisi(i);
        
        int x = 1, y = 2, z;
        z = zbroji(x, y);
        System.out.println(z);
    }

    private static void ispisiHello() {
        System.out.println("Hello");
    }

    private static void ispisi(String s) {
        System.out.println(s);
    }

    private static void ispisi(int i) {
        System.out.println(i);
    }

    private static int zbroji(int x, int y) {
        return x + y;
    }
    
}
