package com.primjer17.kolekcije;
import java.util.*;

public class SuceljeMap {

    public static void main(String[] args) {
        Map<String, String> gradovi = new HashMap<>();
        gradovi.put("ZG", "Zagreb");
        gradovi.put("RI", "Rijeka");
        gradovi.put("SK", "Sisak");
        gradovi.put("ZG", "Zagreb"); // Neće biti dodan
        System.out.println(gradovi);
        System.out.println(gradovi.get("SK"));
        System.out.println(gradovi.containsKey("RI"));
        System.out.println(gradovi.containsValue("Zagreb"));
        
    }

}
