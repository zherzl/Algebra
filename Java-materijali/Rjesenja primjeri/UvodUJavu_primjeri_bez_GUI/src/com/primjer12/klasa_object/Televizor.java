package com.primjer12.klasa_object;

public class Televizor {
    private String boja;
    private int velicinaDijagonale;

    public Televizor(String boja, int velicinaDijagonale) {
        this.boja = boja;
        this.velicinaDijagonale = velicinaDijagonale;
    }

    @Override
    public String toString() {
        //return super.toString(); 
        return "Imate " + boja.toLowerCase() + " televizor, dijagonale incha: " + velicinaDijagonale;
    }
    
    
    
    
    
}
