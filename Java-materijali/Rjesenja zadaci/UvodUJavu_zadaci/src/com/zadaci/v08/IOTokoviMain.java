package com.zadaci.v08;

import java.io.*;
import java.util.*;

public class IOTokoviMain {

    public static void main(String[] args) {
        File f = new File("E:\\Studenti.txt");
        if (f.exists() == false) {
            napraviDatoteku(f);
        }

        List<Student> studenti = parsiranjePodataka(f);
        
        for (Student s : studenti) {
            System.out.println(s);
        }
    }

    private static List<Student> parsiranjePodataka(File file) {

        Scanner sc = new Scanner(System.in);
        List<Student> studenti = new ArrayList<>();
        
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String linija;
            while ((linija = br.readLine()) != null) {
                Student s = new Student();
                String[] linijaSplit = linija.split(";");

                s.setImePrezime(linijaSplit[0]);
                s.setGodinaStudija(Integer.parseInt(linijaSplit[1]));
                s.setProsjek(Double.parseDouble(linijaSplit[2]));

                if (s.getProsjek() < 1.0 || s.getProsjek() > 5.0) {
                    throw new NeispravanProsjekException("Prosjek ocjena mora biti između 1.0 i 5.0");
                }
                if (s.getGodinaStudija() < 1.0 || s.getGodinaStudija() > 5.0) {
                    throw new NeispravanProsjekException("Godina studija mora biti između 1.0 i 5.0");
                }
                
                studenti.add(s);
            }
        } catch (NeispravanProsjekException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return studenti;
    }

    private static void napraviDatoteku(File f) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(f))) {
            StringBuilder sb = new StringBuilder();
            sb.append("Miro Miric;2;4.3\n");
            sb.append("Ivo Ivic;1;2.1\n");
            sb.append("Ana Anic;3;1.3\n");
            sb.append("Marko Markovic;4;3.6\n");

            bw.write(sb.toString());

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
