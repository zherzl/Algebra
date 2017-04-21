/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textfiles;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Zlatko
 */
public class TextFiles {

    static ArrayList<Profesor> profesori = new ArrayList<>();
    static ArrayList<Profesor> profesoriIzFilea = new ArrayList<>();    
    static String fileName = "profesori.txt";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        pripremiPodatke();
        zapisiSveUDatoteku();
        procitajIzDatoteke();
        ispisiProcitanePodatke();
    }

    private static void zapisiSveUDatoteku() {

        File f = new File(fileName);
        FileWriter fw;
        StringBuilder sb = new StringBuilder();
        
        try {
            
            for (Profesor p : profesori) {
                sb.append(p);
            }
            fw = new FileWriter(f);
            BufferedWriter bf = new BufferedWriter(fw);
            bf.write(sb.toString());
            bf.close();
        } catch (IOException ex) {
            System.out.println("Greška kod zpisivanja: " + ex.getMessage());
        }
    }

    private static void pripremiPodatke() {
        for (int i = 1; i <= 10; i++) {
            Profesor p = new Profesor();
            p.setIme("Miro " + i);
            p.setPrezime("Miric " + i);
            p.setBrojKolegija(i + 1);
            profesori.add(p);
        }
    }

    private static void procitajIzDatoteke() {
        
        FileReader fr = null;
        try {
            fr = new FileReader(new File(fileName));
            BufferedReader br = new BufferedReader(fr);
            String linija = null;
            
            while ((linija = br.readLine()) != null) {                
                String[] s = linija.split("\\|");
                Profesor p = new Profesor();
                p.setIme(s[0]);
                p.setPrezime(s[1]);
                p.setBrojKolegija(Integer.parseInt(s[2]));
                profesoriIzFilea.add(p);
            }
            
        } catch (FileNotFoundException ex) {
            System.out.println("File nije pronađen...");
        } catch (IOException ex) {
            System.out.println("Krivo čitanje");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        finally {
            try {
                fr.close();
            } catch (IOException ex) {
                System.out.println("Greška kod čitanja: " + ex.getMessage());
            }
        }
    }

    private static void ispisiProcitanePodatke() {
        for (Profesor p : profesoriIzFilea) {
            System.out.println(p);
        }
    }

}
