package com.hashcode;

public class Test {
    public static void main(String[] args) {
        Dog d1 = new Dog(12,"Black");

        Dog d2 = new Dog(12,"Black");
        System.out.println(d1.equals(d2));

    }
}
