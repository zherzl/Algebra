/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vj02_z03_kovanice_lesk;

/**
 *
 * @author ivan
 */
public class Vj02_Z03_Kovanice_Lesk {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int odabir = 3;
        izbornik(odabir);
    }

    private static void izbornik(int odabir) {
        switch (odabir) {
            case 1:
                //new Zadatak1();
                break;
            case 2:
                //new Zadatak2();
                break;
            case 3:
                new Zadatak3();
                break;
            default:
                throw new AssertionError();
        }
    }

}