package com.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee("Ankit",17721,98636L));
        employees.add(new Employee("Summit",1542,9876455L));
        employees.add(new Employee("Bobby",123,836346L));
        employees.add(new Employee("Nitin",345,977575L));
        System.out.println("Before sorting");
        System.out.println(employees);
        Collections.sort(employees);
        System.out.println("After sorting");
        System.out.println(employees);
    }
}
