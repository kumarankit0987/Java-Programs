package com.singletonClass.ex1;

public class Test {
    public static void main(String[] args) {
        Student s2 = Student.getInstance();
        System.out.println(s2.name + " " + s2.id);
    }
}
