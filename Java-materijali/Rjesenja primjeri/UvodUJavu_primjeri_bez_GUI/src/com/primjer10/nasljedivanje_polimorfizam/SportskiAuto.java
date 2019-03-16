package com.primjer10.nasljedivanje_polimorfizam;

public class SportskiAuto extends Auto {
    private boolean imaPomicniKrov;

    public boolean isImaPomicniKrov() {
        return imaPomicniKrov;
    }

    public void setImaPomicniKrov(boolean imaPomicniKrov) {
        this.imaPomicniKrov = imaPomicniKrov;
    }
    
    public SportskiAuto(boolean imaPomicniKrov, String marka, String model, double ubrzanje) {
        super(marka, model, ubrzanje);
        this.imaPomicniKrov = imaPomicniKrov;
    }

    @Override
    public void vozi() {
        System.out.println("Sportski auto vozi...");
    }

    @Override
    public void stani() {
        System.out.println("Sportski auto se zaustavio...");
    }
    
    
    
    
}
