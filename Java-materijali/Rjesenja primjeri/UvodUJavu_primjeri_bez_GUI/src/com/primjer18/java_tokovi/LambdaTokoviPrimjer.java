package com.primjer18.java_tokovi;

import java.util.*;
import java.util.stream.Collectors;

public class LambdaTokoviPrimjer {

    static List<String> daniUTjednu;
    static List<Korisnik> korisnici;

    public static void main(String[] args) {
        daniUTjednu = new ArrayList<String>();
        daniUTjednu.add("Ponedjeljak");
        daniUTjednu.add("Utorak");
        daniUTjednu.add("Srijeda");
        daniUTjednu.add("Četvrtak");
        daniUTjednu.add("Petak");
        daniUTjednu.add("Subota");
        daniUTjednu.add("Nedjelja");

        filtrirajDane();
        mapPrimjer();
        minMaxPrimjer();
        countPrimjer();
        System.out.println("Prosječna duljina znakova: " + averagePrimjer());
        System.out.println("Ukupno znakova: " + sumPrimjer());
        reducePrimjer();
        
        System.out.println("");

        korisnici = Korisnik.dohvatiKorisnike();
        sortirajKorisnike(korisnici);
        sortedThenComparing(korisnici);
        Korisnik k = findFirstOrElse(korisnici, 2);
        System.out.println("Korisnik s id-em 2: " + k.getIme() + " " + k.getPrezime());
        
        System.out.println("");
        allMatchPrimjer(korisnici);
        noneMatchPrimjer(korisnici);
        anyMatchPrimjer(korisnici);
        
    }

    private static void filtrirajDane() {
        List<String> daniKojiPocinjuSlovomP = daniUTjednu
                .stream()
                .filter(d -> d.startsWith("P"))
                .collect(Collectors.toList());

        System.out.println(daniKojiPocinjuSlovomP);
    }

    private static void mapPrimjer() {
        List<String> daniVelikimSlovima = daniUTjednu
                .stream()
                .map(d -> d.toUpperCase())
                .collect(Collectors.toList());

        System.out.println(daniVelikimSlovima);
    }

    private static void minMaxPrimjer() {
        String danSNajmanjeZnakova = daniUTjednu
                .stream()
                //.max(Comparator.comparing(d -> d.length()))
                .min(Comparator.comparing(d -> d.length()))
                .get();

        System.out.println(danSNajmanjeZnakova);
    }

    private static void countPrimjer() {
        long brojDanaKojiPocinjuSlovomP = daniUTjednu
                .stream()
                .filter(d -> d.startsWith("P"))
                .count();

        System.out.println(brojDanaKojiPocinjuSlovomP);
    }

    private static double averagePrimjer() {
        return daniUTjednu.stream()
                .mapToInt(d -> d.length())
                .average()
                .getAsDouble();
        //rezultat: 7.28571428571
    }

    private static double sumPrimjer() {
        return daniUTjednu.
                stream()
                .mapToInt(d -> d.length())
                .sum();
        //rezultat: 51
    }

    private static void reducePrimjer() {
        String sviDani = daniUTjednu
                .stream()
                .reduce((dani, el) -> dani + ", " + el)
                .get();

        System.out.println(sviDani);
    }

    private static void sortirajKorisnike(List<Korisnik> korisnici) {
        System.out.println("Prije sortiranja");
        System.out.println(korisnici);

        List<Korisnik> sortiranoPoPrezimenuUzlazno
                = korisnici.stream()
                        .sorted(Comparator.comparing(k -> k.getPrezime()))
                        .collect(Collectors.toList());

        System.out.println("Sortirano uzlazno po prezimenu");
        System.out.println(sortiranoPoPrezimenuUzlazno);

        List<Korisnik> sortiranoPoPrezimenuSilazno
                = korisnici.stream()
                        .sorted(Comparator.comparing(Korisnik::getIme).reversed())
                        .collect(Collectors.toList());

        System.out.println("Sortirano silazno po imenu");
        System.out.println(sortiranoPoPrezimenuSilazno);
    }

    private static void sortedThenComparing(List<Korisnik> korisnici) {
        List<Korisnik> sortiranoPoPrezimenuImenu
                = korisnici
                        .stream()
                        .sorted(Comparator.comparing(Korisnik::getPrezime)
                                .thenComparing(Korisnik::getIme))
                        .collect(Collectors.toList());

        System.out.println(sortiranoPoPrezimenuImenu);
    }

    private static Korisnik findFirstOrElse(List<Korisnik> korisnici, int id) {
        Korisnik korisnik = korisnici
                .stream()
                .filter(k -> k.getId() == id)
                .findFirst()
                //.get()
                .orElse(null);

        return korisnik;

    }

    private static boolean allMatchPrimjer(List<Korisnik> korisnici) {
        boolean zadovoljavajuLiSvi = korisnici
                .stream()
                .allMatch(k -> k.getPrezime().length() > 10);
        
        System.out.println(zadovoljavajuLiSvi);
        
        return zadovoljavajuLiSvi;
    }

    private static boolean noneMatchPrimjer(List<Korisnik> korisnici) {
        boolean nitiJedanNeZadovoljava = korisnici
                .stream()
                .noneMatch(k -> k.getPrezime().length() > 100);
        
        System.out.println(nitiJedanNeZadovoljava);
        
        return nitiJedanNeZadovoljava;
    }

    private static boolean anyMatchPrimjer(List<Korisnik> korisnici) {
        boolean postojiLiBaremJedan =  korisnici
                .stream()
                .anyMatch(k -> k.getPrezime().startsWith("M"));
        
        System.out.println(postojiLiBaremJedan);
        
        return postojiLiBaremJedan;
    }

}
