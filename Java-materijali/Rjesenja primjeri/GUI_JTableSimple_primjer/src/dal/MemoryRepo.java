/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import java.util.*;
import java.util.stream.Collectors;
import models.Student;

/**
 *
 * @author YME
 */
public class MemoryRepo implements IRepo {

    private static List<Student> studenti() {
        List<Student> st = new ArrayList<>();
        
        Student s1 = new Student();
        s1.setId(1);
        s1.setIme("Miro");
        s1.setPrezime("Mirić");
        s1.setSmjer("Programsko inženjerstvo");
        st.add(s1);
        
        Student s2 = new Student();
        s2.setId(2);
        s2.setIme("Ivo");
        s2.setPrezime("Ivić");
        s2.setSmjer("Programsko inženjerstvo");
        st.add(s2);
        
        Student s3 = new Student();
        s3.setId(3);
        s3.setIme("Mirka");
        s3.setPrezime("Filipović");
        s3.setSmjer("Programsko inženjerstvo - kickboxing");
        st.add(s3);
        
        Student s4 = new Student();
        s4.setId(4);
        s4.setIme("Marija");
        s4.setPrezime("Faraon");
        s4.setSmjer("Multimedija");
        st.add(s4);
        
        return st;
    }
    
    @Override
    public List<Student> getAllStudents() {
        return studenti();
    }

    @Override
    public void updateStudent(Student s) {
        Student sDb = getStudent(s.getId());
        sDb.setGodinaStudija(s.getGodinaStudija());
        sDb.setIme(s.getIme());
        sDb.setPrezime(s.getPrezime());
        sDb.setSmjer(s.getSmjer());
    }

    
    @Override
    public Student getStudent(int id) {
        return studenti().stream()
                .filter(x -> x.getId() == id)
                .findAny()
                .orElse(null);
    }
    
}
