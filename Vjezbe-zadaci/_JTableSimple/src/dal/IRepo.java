/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import java.util.List;
import models.Student;

/**
 *
 * @author YME
 */
public interface IRepo {
    List<Student> getAllStudents();
    Student getStudent(int id);
    void updateStudent(Student s);
}
