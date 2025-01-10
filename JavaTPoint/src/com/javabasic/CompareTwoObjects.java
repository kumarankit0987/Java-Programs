package com.javabasic;

public class CompareTwoObjects {
    public static void main(String[] args) {
        Person p1 = new Person("Raja",32);
        Person p2 = new Person("Raja",32);
        String s1 = new String("deepak");
        String s2 = new String("deepak");

        System.out.println(s1.equals(s2));

        System.out.println(p1.equals(p2));
        System.out.println(p1==p2);
    }
}
class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}