package com.w3resource_OOPs;

public class Example01 {
    public static void main(String[] args) {
        Person person = new Person("Rahul",21);
        Person person1 = new Person("Ankit",23);
        System.out.println(person.name + " " + person.age);
        System.out.println(person1.name + " " + person1.age);
    }
}
class Person{
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
