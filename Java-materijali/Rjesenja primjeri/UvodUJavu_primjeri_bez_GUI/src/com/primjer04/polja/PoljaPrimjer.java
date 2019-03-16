package com.primjer04.polja;

import java.text.DecimalFormat;

public class PoljaPrimjer {

    public static void main(String[] args) {
        double prosjek;
        int suma = 0;
        int[] ocjene = {4, 5, 3, 3, 2, 2, 5, 5, 4, 2, 3, 5, 5, 4};

        for (int i = 0; i < ocjene.length; i++) {
            suma += ocjene[i];
        }

        prosjek = (double) suma / ocjene.length;
        DecimalFormat twoDForm = new DecimalFormat("#.##");
        System.out.println("Prosječna ocjena studenta je " + twoDForm.format(prosjek));
    }

}
