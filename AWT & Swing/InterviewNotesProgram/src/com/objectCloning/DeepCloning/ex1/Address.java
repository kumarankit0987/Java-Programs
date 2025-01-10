package com.objectCloning.DeepCloning.ex1;

public class Address implements Cloneable{
    String city;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
