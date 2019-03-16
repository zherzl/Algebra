
package com.primjer10.nasljedivanje_polimorfizam;


public class MainKlasa {

   
    public static void main(String[] args) {
        Auto auto = new Auto("Peugeot", "407", 11.0);
        auto.vozi();
        auto.stani();
        System.out.println("-------------------------");
        
        SportskiAuto sportskiAuto = new SportskiAuto(true, "Nissan", "GTR", 3.2);
        sportskiAuto.vozi();
        sportskiAuto.stani();
        System.out.println("-------------------------");
        
        // Implicit cast
        Auto auto2 = sportskiAuto;
        auto2.vozi();
        auto2.stani();
        
        // Explicit cast
        if (auto2 instanceof SportskiAuto) {
            ((SportskiAuto)auto2).stani();
        }
    }
    
}
