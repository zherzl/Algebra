package com.zadaci.v08.zadaci4_5_6;

import java.io.*;

public class CopyFile {

    public static void main(String[] args) {
        InputStream in = null;
        OutputStream out = null;

        try {
            File inFile = new File("zadatak.txt");
            File outFile = new File("kopija.txt");
            
            in = new FileInputStream(inFile);
            out = new FileOutputStream(outFile);

            byte[] buffer = new byte[1024];
            int length;

            while ((length = in.read(buffer)) > 0) {
                out.write(buffer, 0, length);
            }

            in.close();
            out.close();
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

}
