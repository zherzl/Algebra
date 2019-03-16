
package com.primjer13.sucelja;

import java.util.Scanner;

public class MainKlasa {

  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	PretvorbaCelzijus primjer = new PretvorbaCelzijus();
	
	System.out.println("Unesi temperaturu u stupnjevima Celzijusovim: ");
	int t = Integer.parseInt(sc.nextLine());
	
	System.out.println("Temp u Kelvinima: " + primjer.celzijusiUKelvine(t));
	System.out.println("Temp u Fahr.: " + primjer.celzijusiUFahrenheite(t));

    }
    
}
