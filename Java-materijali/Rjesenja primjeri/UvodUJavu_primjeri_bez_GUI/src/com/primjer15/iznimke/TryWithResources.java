package com.primjer15.iznimke;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TryWithResources {

    public static void main(String[] args) {
        File file = new File("C:\\NepostojeciFajl.txt");
        
        try (Scanner sc = new Scanner(file)) {
            
        } catch (FileNotFoundException e) {
            System.out.println("Datoteka nije pronađena...");
        }
    }

}
