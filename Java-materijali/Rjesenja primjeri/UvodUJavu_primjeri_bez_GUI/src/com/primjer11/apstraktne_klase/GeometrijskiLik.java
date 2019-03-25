
package com.primjer11.apstraktne_klase;


public abstract  class GeometrijskiLik {
    // ako klasa ima barem jednu apstraktnu metodu, apstraktna je i klasa
    private String boja;

    public GeometrijskiLik(String boja) {
        super();
        this.boja = boja;
    }
    
    public abstract double povrsina();
    public abstract double opseg();
    
    
}
