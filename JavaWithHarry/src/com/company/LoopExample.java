package com.company;

public class LoopExample {
    public static void main(String[] args) {
        // We will print 1 to 10 numbers.
        // First We will print without using loop.
        System.out.println("Without using loop ");
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        System.out.println(4);
        System.out.println(5);
        System.out.println(6);
        System.out.println(7);
        // if we print 1 to 100 then 10 line of code will be execute
        System.out.println(" Using loop");
        int i = 1;
        while(i<=10) {
            System.out.println(i);
            i++;
        }
    }
}
