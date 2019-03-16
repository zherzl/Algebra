
package com.primjer08.preopterecenje_this_static;


public class ThisStaticPrimjerMain {

  
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Miro", "Miric", 5);
        System.out.println(Student.counter);
    }
    
}
