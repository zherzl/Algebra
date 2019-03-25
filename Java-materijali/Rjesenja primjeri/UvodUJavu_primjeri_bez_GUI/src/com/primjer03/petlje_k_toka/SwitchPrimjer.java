package com.primjer03.petlje_k_toka;

public class SwitchPrimjer {

    public static void main(String[] args) {
        int ocjena = 4;
        switch (ocjena) {
            case 1:
                System.out.println("Nedovoljan");
                break;
            case 2:
                System.out.println("Dovoljan");
                break;
            case 3:
                System.out.println("Dobar");
                break;
            case 4:
                System.out.println("Vrlo dobar");
                break;
            case 5:
                System.out.println("Izvrstan");
                break;
            default:
                System.out.println("Neispravna ocjena");
        }

        SwitchPrimjer2();
    }

    private static void SwitchPrimjer2() {
        int ocjena = 4;
        switch (ocjena) {
            default:
                System.out.println("krivo upisana ocjena");
                break;
            case 1:
            case 3:
            case 5:
                System.out.println("nepar");
                break;
            case 2:
            case 4:
                System.out.println("par");
                break;
        }
    }

}
