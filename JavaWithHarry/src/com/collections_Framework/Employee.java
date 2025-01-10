package com.collections_Framework;

import java.util.ArrayList;

public class Employee implements Comparable<Employee> {
    private String name;
    private int id;
    private long phoneNo;

    @Override
    public int compareTo(Employee o) {
        return id-o.id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", phoneNo=" + phoneNo +
                '}';
    }

    public Employee(String name, int id, long phoneNo) {
        this.name = name;
        this.id = id;
        this.phoneNo = phoneNo;

    }

}
class Test {
    public static void main(String[] args) {
        ArrayList<Employee> al = new ArrayList<>();
        al.add(new Employee("Ankit",101,12233l));
        al.add(new Employee("Raghavan",102,22222l));
        al.add(new Employee("Sneha",107,874645l));

        System.out.println(al);

    }
}
