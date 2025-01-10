package com.immutableClass.Ex1;

import com.immutableClass.Ex1.Employee;

public class Test {
    public static void main(String[] args) {
        Employee e1 = new Employee("Raja", 121);
        System.out.println("Employee name :" + " " + e1.getName());
        System.out.println("Employee Id :" + " " + e1.getId());
    }
}
