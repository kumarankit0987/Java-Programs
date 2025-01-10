package com.Singletonclass;

public class Student {
    String name;
    int id;

    // declare constructor private
     private Student(String name, int id){
        this.name = name;
        this.id = id;
    }
    // declare object reference variable static and private
    private static Student obj;

    public  static Student getInstance(){
        if(obj==null){
            obj = new Student("Ankit", 11);
        }
        return obj;
    }
}