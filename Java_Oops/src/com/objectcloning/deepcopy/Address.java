package com.objectcloning.deepcopy;

public class Address implements Cloneable {
    int add_id;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
