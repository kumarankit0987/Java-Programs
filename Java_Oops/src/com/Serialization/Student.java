package com.Serialization;

import java.io.Serializable;

public class Student implements Serializable {
    private String name;
    private int id;

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

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public Student() {
        super();
    }

    public void display() {
        System.out.println(name + "________________" + id);
    }

}
