/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vjezbe2;

/**
 *
 * @author ivan
 */
public class Zadatak3 {

    private static final int BROJ_DECIMALA = 3;
    private static final int BR_POKRETANJA = 0;
    private String konacniRezultat;

    public Zadatak3() {

        int numA = 28;
        int djelitelj = 7;

        long vrijemePrije = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            podjeli(numA, djelitelj);
        }
        long vrijemePoslije = System.currentTimeMillis();
        System.out.println(String.format("%d / %d = %s", numA, djelitelj, konacniRezultat));
        System.out.println(String.format("Vrijeme izvrsavanja: %d ms", vrijemePoslije - vrijemePrije));
    }

    private void podjeli(int brojA, int djelitelj) {

        Rezultat rez = djeliBroj(brojA, djelitelj);
        konacniRezultat = rez.getRezultat() + ".";

        repeater(rez.getOstatak(), djelitelj, BR_POKRETANJA);
    }

    private Rezultat djeliBroj(int brojA, int djelitelj) {
        int brojac = 0;
        int ostatak = brojA;

        while (ostatak >= djelitelj) {
            brojac++;
            ostatak -= djelitelj;
        }
        Rezultat rez = new Rezultat(brojac, ostatak);
        return rez;
    }

    private int pomnoziSaDeset(int broj) {
        int suma = 0;
        for (int i = 0; i < 10; ++i) {
            suma += broj;
        }
        return suma;
    }

    private void zaokruziZadnjuDecimalu() {
        String zadnjeDvijeZnamenke = konacniRezultat.substring(konacniRezultat.length() - 2, konacniRezultat.length());

        int zadnja = Character.getNumericValue(zadnjeDvijeZnamenke.charAt(1));
        int predZadnja = Character.getNumericValue(zadnjeDvijeZnamenke.charAt(0));

        konacniRezultat = konacniRezultat.substring(0, konacniRezultat.length() - 2);

        if (zadnja >= 5) {
            predZadnja++;
        }
        konacniRezultat += predZadnja;
    }

    private void repeater(int brojA, int djelitelj, int brPokretanja) {
        brPokretanja++;

        if (brPokretanja != BROJ_DECIMALA + 2) {
            brojA = pomnoziSaDeset(brojA);
            Rezultat rez = djeliBroj(brojA, djelitelj);
            konacniRezultat += rez.getRezultat();
            repeater(rez.getOstatak(), djelitelj, brPokretanja);
        } else {
            zaokruziZadnjuDecimalu();
        }
    }
}
