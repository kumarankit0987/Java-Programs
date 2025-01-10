package com.javabasic;

public class FibonacciSeries {

    //In fibonacci series, next number is the sum of previous two numbers
    // for example 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 etc.
    // The first two numbers of fibonacci series are 0 and 1.
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int c;

        for(int i =0; i<=10; i++){
            c = a + b;
            System.out.println(c);

            a =b;
            b=c;
        }
    }
}
