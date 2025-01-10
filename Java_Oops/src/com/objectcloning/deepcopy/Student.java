package com.objectcloning.deepcopy;

public class Student implements Cloneable {
    int id;
    Address address;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Student student = (Student) super.clone();
        student.address = (Address) super.clone();
        return student;
    }
}
