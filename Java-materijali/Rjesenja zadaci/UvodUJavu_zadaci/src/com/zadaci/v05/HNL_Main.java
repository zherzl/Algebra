package com.zadaci.v05;

import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class HNL_Main {

    public static void main(String[] args) {
        try {
            Liga HnlLiga = new Liga();

            Trener dinamoTrener = new Trener(4, "Josip", "Josipović");
            Klub dinamo = new Klub("Dinamo", "Zagreb", dinamoTrener);

            Trener moslavinaTrener = new Trener(2, "Boško", "Buha");
            Klub moslavina = new Klub("Moslavina", "Kutina", moslavinaTrener);

            Trener hajdukTrener = new Trener(12, "Ante", "Antić");
            Klub hajduk = new Klub("Hajduk", "Split", hajdukTrener);

            HnlLiga.klubovi.add(dinamo);
            HnlLiga.klubovi.add(moslavina);
            HnlLiga.klubovi.add(hajduk);

            HnlLiga.utakmice.add(new Utakmica(dinamo, moslavina, 0, 3, null, getStrijelci1Gosti()));
            HnlLiga.utakmice.add(new Utakmica(dinamo, hajduk, 3, 2, getStrijelci2Domaci(), getStrijelci2Gosti()));
            HnlLiga.utakmice.add(new Utakmica(hajduk, moslavina, 5, 1, getStrijelci3Domaci(), getStrijelci3Gosti()));
            HnlLiga.utakmice.add(new Utakmica(hajduk, dinamo, 2, 2, getStrijelci4Domaci(), getStrijelci4Gosti()));

            HnlLiga.IspisUtakmica();
        } catch (Exception ex) {
            System.out.println("Greška: " + ex.getMessage());
        }
    }

    private static List<Igrac> getStrijelci1Gosti() {
        List<Igrac> strijelci = new ArrayList<>();
        Igrac i1 = new Igrac(1, 39, "Pero", "Perić");
        Igrac i2 = new Igrac(2, 45, "Leo", "Mjesi");
        Igrac i3 = new Igrac(22, 41, "Bartol", "Lucky");
        strijelci.add(i1);
        strijelci.add(i2);
        strijelci.add(i3);

        return strijelci;
    }

    private static List<Igrac> getStrijelci2Domaci() {
        List<Igrac> strijelci = new ArrayList<>();
        Igrac i1 = new Igrac(11, 42, "Miro", "Mirić");
        Igrac i2 = new Igrac(10, 41, "Juro", "Jurić");
        Igrac i3 = new Igrac(10, 41, "Juro", "Jurić");
        strijelci.add(i1);
        strijelci.add(i2);
        strijelci.add(i3);
        return strijelci;
    }

    private static List<Igrac> getStrijelci2Gosti() {
        List<Igrac> strijelci = new ArrayList<>();
        Igrac i1 = new Igrac(9, 43, "Marko", "Marić");
        Igrac i2 = new Igrac(7, 40, "Jozo", "Jozić");
        strijelci.add(i1);
        strijelci.add(i2);
        return strijelci;
    }

    private static List<Igrac> getStrijelci3Domaci() {
        List<Igrac> strijelci = new ArrayList<>();
        Igrac i1 = new Igrac(12, 43, "Janko", "Matko");
        Igrac i2 = new Igrac(19, 43, "Vlatko", "Vlatković");
        Igrac i3 = new Igrac(44, 42, "Vladimir", "Keks");
        Igrac i4 = new Igrac(44, 42, "Vladimir", "Keks");
        Igrac i5 = new Igrac(6, 41, "Petar", "Kalašnjikov");
        strijelci.add(i1);
        strijelci.add(i2);
        strijelci.add(i3);
        strijelci.add(i4);
        strijelci.add(i5);
        return strijelci;
    }

    private static List<Igrac> getStrijelci3Gosti() {
        List<Igrac> strijelci = new ArrayList<>();
        Igrac i1 = new Igrac(19, 41, "Jan", "Ban");
        strijelci.add(i1);
        return strijelci;
    }

    private static List<Igrac> getStrijelci4Domaci() {
        List<Igrac> strijelci = new ArrayList<>();
        Igrac i1 = new Igrac(8, 42, "Ivan", "Horvat");
        Igrac i2 = new Igrac(8, 42, "Ivan", "Horvat");
        strijelci.add(i1);
        strijelci.add(i2);
        return strijelci;
    }

    private static List<Igrac> getStrijelci4Gosti() {
        List<Igrac> strijelci = new ArrayList<>();
        Igrac i1 = new Igrac(19, 41, "Krešo", "Metličić");
        Igrac i2 = new Igrac(19, 41, "Krešo", "Metličić");
        strijelci.add(i1);
        strijelci.add(i2);
        return strijelci;
    }

}
