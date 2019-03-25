package com.primjer06.metode;

public class MethodsWithArbitraryParameters {

    public static void main(String[] args) {
        System.out.println(prosjek());
        System.out.println(prosjek(1.2, 2.3));
        System.out.println(prosjek(2));
        double[] arr = {1, 2, 3};
        System.out.println(prosjek(arr));
    }

    private static double prosjek(double... args) {
        if (args.length == 0) {
            return 0;
        }
        
        double p = 0;
        double suma = 0;
        
        for (double d : args) {
            suma += d;
        }
        p = suma/args.length;
        
        return p;
    }

}
