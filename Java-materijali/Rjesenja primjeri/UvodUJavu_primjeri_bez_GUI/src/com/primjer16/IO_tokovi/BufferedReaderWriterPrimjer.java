package com.primjer16.IO_tokovi;

import com.primjer07.klase.Student;
import java.io.*;
import java.util.*;

public class BufferedReaderWriterPrimjer {

    static String datoteka = "BufferedReaderWriter.txt";

    public static void main(String[] args) {
        zapisiDatoteku();
        procitajDatoteku();
    }

    private static void zapisiDatoteku() {
        File f = new File(datoteka);
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(f))) {
            bw.write("Miro;Miric;22");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    private static void procitajDatoteku() {
        File f = new File(datoteka);
        
        try (BufferedReader br = new BufferedReader(new FileReader(f))) {
            String linija;
            while ((linija = br.readLine()) != null) {
                String[] linijaSplit = linija.split(";");
                String ime = linijaSplit[0];
                String prezime = linijaSplit[1];
                int godina = Integer.parseInt(linijaSplit[2]);
                Polaznik p = new Polaznik(ime, prezime, godina);
                System.out.println(p);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}
