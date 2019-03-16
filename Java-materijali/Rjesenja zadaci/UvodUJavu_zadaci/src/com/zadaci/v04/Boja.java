package com.zadaci.v04;

class Boja {
    //ovdje odlucujemo da necemo dozvoliti da se objekt mijenja izvana!
    //ne koristimo properties!
    private int r;
    private int g;
    private int b;

    public int getR() {
        return r;
    }

    public int getG() {
        return g;
    }

    public int getB() {
        return b;
    }

    public Boja(int r, int g, int b) {
        if (r < 0 || r > 255) {
            System.out.println("Crvena boja nije u rasponu od 0 do 255");
        }
        
        if (g < 0 || g > 255) {
            System.out.println("Zelena boja nije u rasponu od 0 do 255");
        }
        
        if (b < 0 || b > 255) {
            System.out.println("Plava boja nije u rasponu od 0 do 255");
        }
        this.r = r;
        this.g = g;
        this.b = b;
    }

    
}
