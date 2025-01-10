package com.objectcloning.shallowcloning;

public class Student implements Cloneable{
    int rollNo;
    Address address;
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
