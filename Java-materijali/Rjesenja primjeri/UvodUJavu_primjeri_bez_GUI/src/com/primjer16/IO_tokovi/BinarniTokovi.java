package com.primjer16.IO_tokovi;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BinarniTokovi {

    static String datoteka = "datoteka.txt";
    static String datoteka2 = "datoteka2.txt";
    static String mojTekst = "tekst";

    public static void main(String[] args) {
        try {
            zapisiDatoteku();
            procitajDatoteku();
            zapisiDatotekuBufferedOutputStream();
            procitajDatotekuBufferedOutputStream();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }

    private static void zapisiDatoteku() throws FileNotFoundException, IOException {
        OutputStream izlazniTok = new FileOutputStream(datoteka);
        izlazniTok.write(mojTekst.getBytes());
    }

    private static void procitajDatoteku() throws IOException {

        InputStream ulazniTok = null;
        try {
            ulazniTok = new FileInputStream(datoteka);
            byte bajt = (byte) ulazniTok.read();
            while (bajt != -1) {
                System.out.println("Bajt: " + bajt);
                bajt = (byte) ulazniTok.read();
            }
            ulazniTok.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Datoteka nije pronađena");
        } finally {
            try {
                ulazniTok.close();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }

    }

    private static void zapisiDatotekuBufferedOutputStream() {
        File file = new File(datoteka2);
        String s = "Ovo su java tokovi.......";
        
        try (OutputStream output = new BufferedOutputStream(new FileOutputStream(file), 1024)) {
            byte[] b = s.getBytes();
            output.write(b);
            output.flush();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static void procitajDatotekuBufferedOutputStream() {
        File file = new File(datoteka2);
        try (BufferedInputStream input = new BufferedInputStream(new FileInputStream(file), 1024)) {
            byte b;
            while ((b = (byte)input.read()) != -1) {
                System.out.println(b);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
