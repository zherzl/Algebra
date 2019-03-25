package com.zadaci.v09;

import com.zadaci.v09.*;
import com.zadaci.v09.models.*;
import com.zadaci.v09.repo.*;
import com.zadaci.v09.repo.MyEnums.RepoType;
import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class LambdaTokoviMain {

    public static void main(String[] args) {
        Repository repo = RepositoryFactory.getRepository(RepoType.FileRepo);
        List<Student> students = repo.getStudents();
        //ispisiStudente(students);

        filtrirajStudenteZaGodinu(students, 2);
        smjerVelikimSlovima(students);
        prosjekUpisanihKolegija(students);
        sortirajPoGodini(students);
        Student s = findFirstByGodina(students, 2);
        System.out.println("------ Pronađeni student:-----------");
        ispisJednogStudenta(s);
    }

    private static void ispisiStudente(List<Student> students) {
        for (Student s : students) {
            ispisJednogStudenta(s);
        }
    }

    private static void ispisJednogStudenta(Student s) {
        
        System.out.println(s.getName() + " / " + s.getLastName() + " / " + s.getSmjer() + " / " + s.getGodinaStudija());
        for (Course course : s.upisaniKolegiji) {
            System.out.println("\t" + course.getImeKolegija());
        }
        
        System.out.println("");
        System.out.println("-----------------------------");
    }

    private static void filtrirajStudenteZaGodinu(List<Student> studenti, int godinaStudija) {
        List<Student> filtrirano = studenti.stream()
                .filter(x -> x.getGodinaStudija() == godinaStudija)
                .collect(Collectors.toList());

        ispisiStudente(filtrirano);
    }

    private static void smjerVelikimSlovima(List<Student> students) {
        List<Student> studentiMap = students.stream()
                .map(x -> new Student(x.getId(), x.getName(),
                x.getLastName(), x.getSmjer().toUpperCase(), x.getGodinaStudija(), x.upisaniKolegiji))
                .collect(Collectors.toList());
        System.out.println("---------------------------------");
        System.out.println("--------Map velika slova---------");
        ispisiStudente(studentiMap);
    }

    private static void prosjekUpisanihKolegija(List<Student> students) {
        double prosjek = students.stream()
                .mapToInt(x -> x.upisaniKolegiji.size())
                .average()
                .getAsDouble();

        System.out.println("---------------------------------");
        System.out.println("--------Prosječno upisanih kolegija---------");
        System.out.println(prosjek);
    }

    private static void sortirajPoGodini(List<Student> students) {
        List<Student> sortirano = students.stream()
                .sorted(Comparator.comparing(x -> x.getGodinaStudija()))
                .collect(Collectors.toList());

        System.out.println("---------------------------------");
        System.out.println("--------Sortirano po godini---------");
        ispisiStudente(sortirano);
    }

    private static Student findFirstByGodina(List<Student> students, int godina) {
        Student s = students.stream()
                .filter(x -> x.getGodinaStudija() == godina)
                .findFirst()
                .orElse(null);

        return s;
    }
}
