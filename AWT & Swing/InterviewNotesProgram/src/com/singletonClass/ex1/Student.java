package com.singletonClass.ex1;

public class Student {
    String name;
    int id;

    private Student(String name, int id) {
        this.id = id;
        this.name = name;
    }

    private static  Student s1;

    public static Student getInstance(){
       if( s1== null) {
           s1 = new Student("Ankit", 321);
       }
       return s1;
    }
}
