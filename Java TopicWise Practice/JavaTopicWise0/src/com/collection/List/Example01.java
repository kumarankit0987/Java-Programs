package com.collection.List;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Example01 {
    public static void main(String[] args) {
        Student s1 = new Student("raja",121);
        Student s2 = new Student("Ankit",111);
        Student s3 = new Student("raja",121);

        // Create a ArrayList
        List<Student> list1 = new ArrayList<>();
        list1.add(s1);
        list1.add(s2);
        list1.add(s3);
        for(Student s:list1){
            System.out.println(s);
        }
    }
}
class Student{
    String name;
    int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "name='" + name + " " +
                ", id=" + id;
    }
    
}
