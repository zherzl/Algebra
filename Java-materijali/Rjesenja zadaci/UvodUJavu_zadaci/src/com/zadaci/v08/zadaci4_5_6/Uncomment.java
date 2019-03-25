package com.zadaci.v08.zadaci4_5_6;

import java.io.*;

public class Uncomment {

    public static void main(String[] args) {
        StringBuilder kod = new StringBuilder();

        try (BufferedReader br = new BufferedReader(new FileReader("input.class"))) {
            String temp;
            Boolean multiLine = false;

            while ((temp = br.readLine()) != null) {
                if (temp.trim().startsWith("/*")) {
                    multiLine = true;
                }
                
                if (!temp.trim().startsWith("//") && !multiLine) {
                    kod.append(temp + "\n");
                }
                
                if (temp.trim().endsWith("*/")) {
                    multiLine = false;
                }
            }

            //System.out.println(kod.toString());
            
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        
        zapisiFile(kod);
    }

    private static void zapisiFile(StringBuilder kod) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("input2.class"))) {
            bw.write(kod.toString());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
