package com.interfaces;

interface A {
    void show();
}
interface B {
    void print();
}
class Abc implements A,B { // Class Abc implements multiple interface
    public void show() {
        System.out.println("Show");
    }
    public void print() {
        System.out.println("Print");
    }
}
public class Multiple_Interface {
    public static void main(String[] args) {
        Abc obj = new Abc();
        obj.print();
        obj.show();
    }
}
