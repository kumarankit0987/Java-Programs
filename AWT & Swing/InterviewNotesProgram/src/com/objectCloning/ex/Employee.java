package com.objectCloning.ex;

public class Employee implements Cloneable {
     String name;
     int id;

    Employee(String name, int id){
        this.name = name;
        this.id = id;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
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
}
