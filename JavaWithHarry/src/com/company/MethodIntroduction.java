package com.company;

public class MethodIntroduction {
    static void myMethod() {
        System.out.println("When we use void they will return nothing");
    }
    public static void main(String[] args) {
        // Call the method
        myMethod();
        // we can call the method multiple times like that
        myMethod();
        myMethod();
        myMethod();
    }
}
