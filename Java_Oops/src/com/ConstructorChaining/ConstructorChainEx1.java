package com.ConstructorChaining;

import com.sun.security.jgss.GSSUtil;

class Employee {
    String name;
    int id;
    float salary;
    Employee() {
        this("Ankit",121, 12000.0f);
        System.out.println("This is default constructor");
    }
    Employee(String name, int id, float salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        System.out.println(name + " " + id + " " + salary);
    }
}
public class ConstructorChainEx1 {
    public static void main(String[] args) {
        Employee e1 = new Employee();
    }
}
