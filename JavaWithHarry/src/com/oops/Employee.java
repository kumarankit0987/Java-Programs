package com.oops;

public class Employee {
    String name;
    int salary;
    int getSalary() {

        return salary;
    }
    String getName() {

        return name;
    }
    void setName(String n) {
        name = n;
    }

    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.setName("Ankit Kumar");
        System.out.println(e1.getName());
        e1.salary = 2000;
        System.out.println(e1.getSalary());
    }
}
