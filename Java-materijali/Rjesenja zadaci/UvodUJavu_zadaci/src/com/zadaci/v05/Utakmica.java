package com.zadaci.v05;

import java.util.*;

class Utakmica {

    private static int idCount = 1;

    private Klub klubDomacin;
    private Klub klubGost;
    private int rezultatDomacin = 0;
    private int rezultatGost = 0;
    List<Igrac> strijelciDomacin;
    List<Igrac> strijelciGost;

    public Utakmica(Klub klubDomacin, Klub klubGost, int rezultatDomacin, int rezultatGost,
            List<Igrac> strijelciDomacin, List<Igrac> strijelciGost) throws Exception {
        this.klubDomacin = klubDomacin;
        this.klubGost = klubGost;
        this.rezultatDomacin = rezultatDomacin;
        this.rezultatGost = rezultatGost;
        this.strijelciDomacin = strijelciDomacin;
        this.strijelciGost = strijelciGost;

//        if (rezultatDomacin ==  || rezultatGost) {
//            
//        }
        if (rezultatDomacin > 0 && strijelciDomacin.size() == 0) {
            throw new Exception("Rezultat domaćih upisan bez strijelaca");
        }

        if (rezultatGost > 0 && strijelciGost.size() == 0) {
            throw new Exception("Rezultat gostiju upisan bez strijelaca");
        }
    }

    @Override
    public String toString() {
        return this.klubDomacin.getNaziv() + " vs " + this.klubGost.getNaziv() + " " + this.rezultatDomacin + " : " + this.rezultatGost;
    }

    void ispisStrijelaca() {
        System.out.println("Trener domacih:");
        System.out.println("\t" + klubDomacin.getTrener().getIme()
                + " " + klubDomacin.getTrener().getPrezime()
                + " godine iskustva: " + klubDomacin.getTrener().getGodineIskustvaTrenera());

        System.out.println("Strijelci domacin: ");
        if (strijelciDomacin != null) {
            for (Igrac igrac : strijelciDomacin) {
                System.out.println(igrac);
            }
        }

        System.out.println("");

        System.out.println("Trener gostiju:");
        System.out.println("\t" + klubGost.getTrener().getIme()
                + " " + klubGost.getTrener().getPrezime()
                + " godine iskustva: " + klubGost.getTrener().getGodineIskustvaTrenera());

        System.out.println("Strijelci gost: ");
        if (strijelciGost != null) {
            for (Igrac igrac : strijelciGost) {
                System.out.println(igrac);
            }
        }
        
        System.out.println("-----------------------------------------");
    }

}
