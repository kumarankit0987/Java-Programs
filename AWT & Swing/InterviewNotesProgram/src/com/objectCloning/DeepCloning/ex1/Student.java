package com.objectCloning.DeepCloning.ex1;

public class Student implements Cloneable{
    String name;
    int id;
    Address address;

    @Override
    protected Object clone() throws CloneNotSupportedException {
       Student student = (Student)super.clone();
       student.address = (Address)address.clone();
       return student;
    }
}
