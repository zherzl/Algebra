package com.primjer04.polja;

import java.util.Arrays;

public class OperacijeNadPoljimaPrimjer {
    
    public static void main(String[] args) {
        String[] polje = {"Milica", "Gojsko", "Rastislav", "Milivoj", "Laars"};
        for (String ime : polje) {
            System.out.println(ime);
        }
        
        System.out.println("\nSortirano\n");
        Arrays.sort(polje);
        for (String ime : polje) {
            System.out.println(ime);
        }
        
        Arrays.fill(polje, "Donald");
        System.out.println("\nNapunjeno\n");
        for (int i = 0; i < polje.length; i++) {
            System.out.println(polje[i]);
        }
    }
    
}
