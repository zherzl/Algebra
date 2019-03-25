package com.primjer06.metode;

import java.util.*;


public class PassByValueAndReferencePrimjer {


    public static void main(String[] args) {
        int i = 1;
        passByValue(i);
        System.out.println("main: " + i);
        
        List<String> names = new ArrayList<>();
        System.out.println("main before add: " + names.size());
        passByReference(names);
        System.out.println("main: " + names.size());
    }

    private static void passByValue(int i) {
        i++;
        System.out.println("method: " + i);
    }

    private static void passByReference(List<String> names) {
        names.add("Daniel");
        System.out.println("method: " + names.size());
    }
    
}
