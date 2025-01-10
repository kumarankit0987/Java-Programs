package com.testing2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Student implements Comparable<Student> {
    String name;
    int id;
    String email;

    public Student(String name, int id, String email) {
        this.name = name;
        this.id = id;
        this.email = email;
    }

    @Override
    public int compareTo(Student o) {
     return name.compareTo(o.name);

    }

    public static void main(String[] args) {
        List<Student> s1 = new ArrayList<>();
        s1.add(new Student("a",1,"e1"));
        s1.add(new Student("b",2,"e1"));
        s1.add(new Student("r",1,"e1"));
        s1.add(new Student("c",1,"e1"));

        Collections.sort(s1);
        System.out.println("Name" + "\t" + "id" + "\t" + "email" );
        for(int i =0; i<s1.size(); i++) {
            System.out.println(s1.get(i).name+" "+s1.get(i).id+ " " + s1.get(i).email);
        }
    }
}

