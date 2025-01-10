package com.collections_Framework.Comprator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> student = new ArrayList<>();
        student.add(new Student("Raj",1001,873367372l));
        student.add(new Student("Karan",1002,28282728l));
        student.add(new Student("Ram",1007,82827272l));

        Collections.sort(student,new Name());
        Collections.sort(student, new RollNo());
        Collections.sort(student, new MobileNo());
        System.out.println(student);
    }
}
