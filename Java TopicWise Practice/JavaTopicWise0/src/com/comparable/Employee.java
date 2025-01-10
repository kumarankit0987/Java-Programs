package com.comparable;

public class Employee implements Comparable<Employee> {
    private String name;
    private int id;
    private long mobile;

    public Employee() {
    }

    public Employee(String name, int id, long mobile) {
        this.name = name;
        this.id = id;
        this.mobile = mobile;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getMobile() {
        return mobile;
    }

    public void setMobile(long mobile) {
        this.mobile = mobile;
    }

    @Override
    public int compareTo(Employee o) {
        return this.getName().compareTo(o.getName());
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", id=" + id +
                ", mobile=" + mobile ;
    }
}
