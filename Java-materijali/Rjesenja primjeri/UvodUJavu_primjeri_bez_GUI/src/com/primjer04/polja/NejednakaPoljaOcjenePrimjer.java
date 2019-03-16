package com.primjer04.polja;

import java.text.DecimalFormat;

public class NejednakaPoljaOcjenePrimjer {

    public static void main(String[] args) {
        double[][] mjerenjaTemperatureUTjednu = new double[7][];

        //u ponedjeljak imamo 5 mjerenja
        mjerenjaTemperatureUTjednu[0] = new double[5];

        //u utorak imamo 8 mjerenja
        mjerenjaTemperatureUTjednu[1] = new double[8];

        //u srijedu imamo 4 mjerenja
        mjerenjaTemperatureUTjednu[2] = new double[4];

        //u četvrtak imamo 2 mjerenja
        mjerenjaTemperatureUTjednu[3] = new double[2];

        //u petak imamo 6 mjerenja
        mjerenjaTemperatureUTjednu[4] = new double[6];

        //u subotu imamo 3 mjerenja
        mjerenjaTemperatureUTjednu[5] = new double[3];

        //u nedjelju imamo 2 mjerenja
        mjerenjaTemperatureUTjednu[6] = new double[2];

        DecimalFormat twoDForm = new DecimalFormat("#.##");

        //koristeći metodu za kreiranje slucajnih brojeva napunimo polje slučajnim vrijednostima u opsegu -30..30
        for (int i = 0; i < mjerenjaTemperatureUTjednu.length; i++) {
            for (int j = 0; j < mjerenjaTemperatureUTjednu[i].length; j++) {
                mjerenjaTemperatureUTjednu[i][j] = (Math.random() * 60) - 30;
            }
        }

        //ispis mjerenja temperature
        for (int i = 0; i < mjerenjaTemperatureUTjednu.length; i++) {
            System.out.println("---------");
            System.out.println((i + 1) + ". dan:");
            System.out.println("---------");
            for (int j = 0; j < mjerenjaTemperatureUTjednu[i].length; j++) {
                System.out.println((j + 1) + ". mjerenje:"
                        + twoDForm.format(mjerenjaTemperatureUTjednu[i][j]) + " stupnjeva Celziusa");
            }
        }

    }

}
