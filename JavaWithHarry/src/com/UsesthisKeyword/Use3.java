package com.UsesthisKeyword;

public class Use3 { Use3() {
        System.out.println("non-argument constructor");
    }
    //this keyword can be used to invoke the current class constructor.
    Use3(int a) {
        this();
        System.out.println("Parameterized constructor");
    }
    public static void main(String[] args) {
        Use3 obj = new Use3(10);
    }
}
