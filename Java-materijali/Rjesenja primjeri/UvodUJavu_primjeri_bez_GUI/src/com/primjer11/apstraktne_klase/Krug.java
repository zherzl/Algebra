
package com.primjer11.apstraktne_klase;


public class Krug extends GeometrijskiLik{

    private int r;

    public Krug(int r, String boja) {
        super(boja);
        this.r = r;
    }
    
    
    @Override
    public double povrsina() {
        return Math.pow(r, 2) * Math.PI;
    }

    @Override
    public double opseg() {
        return 2 * r * Math.PI;
    }
    
}
