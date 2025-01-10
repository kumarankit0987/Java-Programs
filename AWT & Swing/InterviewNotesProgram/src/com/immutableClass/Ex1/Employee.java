package com.immutableClass.Ex1;

public final class Employee {
    final String name;
     final int id;

     public Employee(String name, int id){
         this.name = name;
         this.id = id;
     }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}
