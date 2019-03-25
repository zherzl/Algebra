package com.primjer07.klase;

public class KlasaMain {

    public static void main(String args[]) {
        Student s = new Student();
//        s.setIme("Pero");
//        s.prezime = "Perić";
//        s.brojIndeksa = 2310;
//

        s.setIme("Pero");
        s.setPrezime("Peric");
        s.setBrojIndeksa(2310);
        s.prijaviIspit("Java");
        s.prijaviIspit("OOP");
        System.out.println(s.dohvatiPodatke());
        
        Student s1 = new Student(2311, "Marko", "Markovic");
        s1.prijaviIspit("Matematika");
        s1.prijaviIspit("Engleski");
        System.out.println(s1.dohvatiPodatke());
        
    }

}
