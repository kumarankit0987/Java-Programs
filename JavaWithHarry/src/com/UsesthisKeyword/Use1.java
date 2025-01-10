package com.UsesthisKeyword;

public class Use1 {
    // this keyword refers to the current class instance variable
    int a; // created instance variable
    public void method(int a) {
        // if we don't use this keyword then print a = 0;
        // Because if we write a = a
        this.a = a;
    }
    void print() {
        System.out.println(a);
    }

    public static void main(String[] args) {
        Use1 obj = new Use1();
        obj.method(10);
        obj.print();
    }
}
