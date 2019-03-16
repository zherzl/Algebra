package com.primjer05.nizoviznakova;

public class MetodeKlaseString {

    public static void main(String[] args) {
        spajanjePrimjer();
        System.out.println("");
        endsStartsWithPrimjer();
        System.out.println("");
        equalsPrimjer();
        System.out.println("");
        indexOfPrimjer();
        System.out.println("");
        lengthPrimjer();
        System.out.println("");
        substringPrimjer();
        System.out.println("");
        splitPrimjer();
        System.out.println("");
        lowerCaseUpperCasePrimjer();
        System.out.println("");
        trimPrimjer();
    }

    private static void spajanjePrimjer() {
        String ime = "Pero";
        System.out.println("Dobar dan, " + ime);
    }

    private static void endsStartsWithPrimjer() {
        String[] mojiSusjedi = {"Marko", "Ana", "Bojan", "Goran", "Pero", "Marija"};

        System.out.println("Imena koja završavaju slovom \"n\":");

        for (String s : mojiSusjedi) {
            if (s.endsWith("n")) {
                System.out.println(s);
            }
        }
        
        System.out.println("Imena koja počinju slovom \"n\":");
        
        for (String s : mojiSusjedi) {
            if (s.startsWith("M")) {
                System.out.println(s);
            }
        }

    }

    private static void equalsPrimjer() {
        // mojeIme == tvojeIme // ne može!
        String mojeIme = "Danijel";
        String tvojeIme = "Marko";
        if (mojeIme.equals(tvojeIme)) {
            System.out.println("Mi imamo isto ime!");
        } else {
            System.out.println("Mi imamo različita imena!");
        }
    }

    private static void indexOfPrimjer() {
        String fakultet = "Visoka škola za primijenjeno računarstvo";
        String trazeniNizZnakova = "škola";

        System.out.println(fakultet.indexOf(trazeniNizZnakova));
        System.out.println(fakultet.indexOf("Java"));
    }

    private static void lengthPrimjer() {
        String fakultet = "Visoka škola za primijenjeno računarstvo";
        //Od koliko znakova se sastoji varijabla fakultet?
        System.out.println(fakultet.length());

    }

    private static void splitPrimjer() {
        String fakultet = "Visoka škola za primijenjeno računarstvo";
        String[] rezPolje = fakultet.split(" ");
        for (String s : rezPolje) {
            System.out.println(s);
        }
    }

    private static void substringPrimjer() {
        String datumRodenja = "12.05.1984";
        System.out.println("Godina rodjenja: " + datumRodenja.substring(6, 10));
    }

    private static void lowerCaseUpperCasePrimjer() {
        String mojeSelo = "Sveti Petar u Šumi";
        System.out.println(mojeSelo.toLowerCase());
        System.out.println(mojeSelo.toUpperCase());

    }

    private static void trimPrimjer() {
        String recenica = "   Danas pada snijeg  ";
        System.out.println(recenica);
        //koliko ima znakova u rečenici?
        System.out.println(recenica.length() + " znaka");
        //iz rečenice ukloni vodeće i završne razmake
        recenica = recenica.trim();
        //koliko sad ima znakova u rečenici?
        System.out.println(recenica);
        System.out.println(recenica.length() + " znakova");
    }

}
