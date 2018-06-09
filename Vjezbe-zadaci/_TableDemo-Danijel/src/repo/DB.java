/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author danijel.kucak
 */
public class DB {
    
    public static List<Student> getStudents() {
        Student s1 = new Student("a1", 1, true, 4.2f, "Rakitić");
        Student s2 = new Student("a2", 1, true, 3.1f, "Modrić");
        Student s3 = new Student("a3", 1, true, 2.7f, "Ćorluka");
        
        return new ArrayList<>(Arrays.asList(s1, s2, s3));
        
    }
    
}
