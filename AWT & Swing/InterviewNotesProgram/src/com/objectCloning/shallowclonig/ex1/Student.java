package com.objectCloning.shallowclonig.ex1;

public class Student implements Cloneable {
    int id;
    String name;
    Address address;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
