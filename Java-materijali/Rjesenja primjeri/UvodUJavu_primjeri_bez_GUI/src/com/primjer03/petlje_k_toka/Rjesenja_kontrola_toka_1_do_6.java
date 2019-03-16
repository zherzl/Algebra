package com.primjer03.petlje_k_toka;

public class Rjesenja_kontrola_toka_1_do_6 {

    public static void main(String[] args) {
        rjesenje1();
        rjesenje2();
        rjesenje3();
        rjesenje4();
        rjesenje5();
        rjesenje6();
    }

    private static void rjesenje1() {
        int mjesec = -1;
        switch (mjesec) {
            case 1:
                System.out.println("Siječanj");
                break;
            case 2:
                System.out.println("Veljača");
                break;
            case 3:
                System.out.println("Ožujak");
                break;
            case 4:
                System.out.println("Travanj");
                break;
            case 5:
                System.out.println("Svibanj");
                break;
            case 6:
                System.out.println("Lipanj");
                break;
            case 7:
                System.out.println("Srpanj");
                break;
            case 8:
                System.out.println("Kolovoz");
                break;
            case 9:
                System.out.println("Rujan");
                break;
            case 10:
                System.out.println("Listopad");
                break;
            case 11:
                System.out.println("Studeni");
                break;
            case 12:
                System.out.println("Prosinac");
                break;
            default:
                System.out.println("Nepostojeći mjesec");
                break;
        }

    }

    private static void rjesenje2() {
//        System.out.println("Miro Miric");
//        System.out.println("");
//        System.out.println("Zagreb");
        System.out.println("Miro Miric\n\nZagreb\n");
    }

    private static void rjesenje3() {
        int a = 5;
        double b = 3.0;
        double zbroj = a + b;
        System.out.println(a + " + " + b + " = " + zbroj);
    }

    private static void rjesenje4() {
        double a = 3;
        double b = 4;
        /*
            double c2 = Math.pow(a, 2) * Math.pow(b, 2);
         */
        double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        System.out.println(c);
    }

    private static void rjesenje5() {
        int broj = 20;
        if (broj % 5 == 0) {
            System.out.println("Broj je djeljiv s 5");
        } else {
            System.out.println("Broj nije djeljiv s 5");
        }
    }

    private static void rjesenje6() {
        int bodovi = 110;
        if (bodovi < 0 || bodovi > 100) {
            System.out.println("Krivi unos bodova");
            return;
        }

        if (bodovi >= 90) {
            System.out.println("Odlican");
        } else if (bodovi >= 80) {
            System.out.println("Vrlo dobar");
        } else if (bodovi >= 70) {
            System.out.println("Dobar");
        } else if (bodovi >= 60) {
            System.out.println("Dovoljan");
        } else {
            System.out.println("Nedovoljan");
        }
    }

}
