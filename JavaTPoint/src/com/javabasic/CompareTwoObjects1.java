package com.javabasic;

public class CompareTwoObjects1 {
    public static void main(String[] args) {
        Employee emp1 = new Employee(918, "Maria");
        Employee emp2 = new Employee(918, "Maria");

        System.out.println(emp1.hashCode());
        System.out.println(emp2.hashCode());

        System.out.println(emp1.equals(emp2));
    }
}
class Employee {
    String name;
    int id;

    Employee(int id, String name){
        this.id = id;
        this.name = name;
    }
}
