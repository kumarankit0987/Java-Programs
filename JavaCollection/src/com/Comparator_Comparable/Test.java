package com.Comparator_Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();



        students.add(new Student("Bala",123,"bala213@gmail.com"));
        students.add(new Student("clvish",122,"elvish231@gmail.com"));
        students.add(new Student("daras",124,"paras65488gmail.com"));
        students.add(new Student("daras",121,"paras6542gmail.com"));
        System.out.println(students);
        System.out.println("After sorting......................");
      //  Collections.sort(students,new IdComparator());
       // System.out.println(students);
        Collections.sort(students,new NameComparator());
        System.out.println(students);
        List<Student> studentList = students.stream().sorted(Comparator.comparing(Student::getName).thenComparing(Student::getRollNo)).toList();
        System.out.println(studentList);
//        List<Student> students1 = new ArrayList<>(students);
//        Collections.sort(students1,new NameComparator());
//        System.out.println(students1);
    }
}
