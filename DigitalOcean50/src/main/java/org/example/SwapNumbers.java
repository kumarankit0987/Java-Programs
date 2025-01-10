package org.example;

public class SwapNumbers {
    // swap two numbers without using third variable
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        // swap no using third variable
        int c;
        c = a; // c = 10
        a = b; // a = 20
        b = c; // b = 10
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
