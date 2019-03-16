package com.primjer11.apstraktne_klase;

public class Pravokutnik extends GeometrijskiLik {

    private int a, b;

    public Pravokutnik(int a, int b, String boja) {
        super(boja);
        this.a = a;
        this.b = b;
    }
    
    // nema poziva super.povrsina()!
    @Override
    public double povrsina() {
        return a * b;
    }

    @Override
    public double opseg() {
        return 2 * (a + b);
    }

}
