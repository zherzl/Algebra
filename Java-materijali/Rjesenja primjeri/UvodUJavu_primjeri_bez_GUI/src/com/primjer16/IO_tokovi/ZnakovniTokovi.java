package com.primjer16.IO_tokovi;
import java.io.*;

public class ZnakovniTokovi {

    static String filename = "datoteka2.txt";
    
    public static void main(String[] args) {
        try (Reader r = new FileReader(filename)) {
            int data;
            
            while ((data = r.read()) != -1) {
                System.out.println((char)data);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
