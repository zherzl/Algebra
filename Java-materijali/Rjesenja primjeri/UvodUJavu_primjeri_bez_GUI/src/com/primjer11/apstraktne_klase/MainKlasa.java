
package com.primjer11.apstraktne_klase;

import java.lang.reflect.Array;
import java.util.*;


public class MainKlasa {

  
    public static void main(String[] args) {
        // Apstrakcija se ne može inicijalizirati
        GeometrijskiLik pravokutnik = new Pravokutnik(2, 3, "Crveni");
        GeometrijskiLik krug = new Krug(2, "Plavi");
        List<GeometrijskiLik> lista = new ArrayList<>();
        
        lista.add(pravokutnik);
        lista.add(krug);
        
        for (GeometrijskiLik lik : lista) {
            System.out.println(lik.povrsina());
            System.out.println(lik.opseg());
        }
    }
    
}
