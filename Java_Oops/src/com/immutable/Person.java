package com.immutable;

// First make the class final
public final class Person {
    // make instance variable of that class final
    final String name;
    final long mobileNo;

    //Use parametrized constructor to initialize the fields or instance.
    Person(String name, long mobileNo){
        this.name = name;
        this.mobileNo = mobileNo;
    }
    // only getter method is allowed

    public String getName(){
        return  name;
    }

    public long getMobileNo(){
        return mobileNo;
    }


}
