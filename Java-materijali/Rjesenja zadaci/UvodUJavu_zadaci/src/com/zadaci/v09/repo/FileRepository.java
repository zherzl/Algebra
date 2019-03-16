package com.zadaci.v09.repo;

import com.zadaci.v09.models.Course;
import com.zadaci.v09.models.Student;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class FileRepository implements Repository {

    @Override
    public List<Student> getStudents() {
        List<Student> studenti = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader("Studenti.txt"))) {
            String linija;
            while ((linija = br.readLine()) != null) {
                String[] studentiSplitano = linija.split(";");
                int id = Integer.parseInt(studentiSplitano[0]);
                String ime = studentiSplitano[1];
                String prezime = studentiSplitano[2];
                int godinaStudija = Integer.parseInt(studentiSplitano[3]);
                String smjer = studentiSplitano[4];
                Student s = new Student(id, ime, prezime, smjer, godinaStudija);
                dodajUpisaneKolegije(s, studentiSplitano[5]);
                
                studenti.add(s);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return studenti;
    }

    private void dodajUpisaneKolegije(Student student, String kolegiji) {
        String[] kolegijiSplitano = kolegiji.split("\\|");
        
        for (String k : kolegijiSplitano) {
            Course course = new Course();
            course.setImeKolegija(k);
            student.upisaniKolegiji.add(course);
        }
    }

}
