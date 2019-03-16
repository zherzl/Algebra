package com.zadaci.v04;

public class ZadatakMain {

    public static void main(String[] args) {

        // Objasniti konstruktor s pozivom this(...) u klasi prozor
        Prozor p = new Prozor();
        p.setTitle("Prozor 0");
        p.setLabel("pr1");
        p.setTopLeft(new Point(1, 20));
        p.setBottomRight(new Point(20, 60));
        p.setBoja(new Boja(255, 100, 150));
        p.setIsActive(true);
        p.ispisiProzor();

        System.out.println("Sirina: " + p.width());
        System.out.println("Visina: " + p.height());
        System.out.println("Povrsina: " + p.area());
        System.out.println("Povrsina: " + p.perimeter());

        p.drawBorder();
        p.drawFill();

        Prozor window2 = new Prozor("Prozor2", "w1", new Point(10, 10), new Point(20, 15), new Boja(255, 0, 0), true);
        window2.ispisiProzor();

    }

}
