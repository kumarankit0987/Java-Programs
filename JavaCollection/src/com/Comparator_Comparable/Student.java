package com.Comparator_Comparable;

import java.util.Comparator;

public class Student  {
    String name;
    int rollNo;
    String email;
    public Student(String name, int  rollNo, String email) {
        this.name = name;
        this.rollNo = rollNo;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNo=" + rollNo +
                ", email='" + email + '\'' +
                '}';
    }

}
