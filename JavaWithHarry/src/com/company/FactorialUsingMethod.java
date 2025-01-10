package com.company;

public class FactorialUsingMethod {
    static int multiply(int n) {
        int factorial =1;
        for(int i = n; i >0; i--) {
            factorial =factorial * i;
        }
       return factorial;
    }
//    static int fac(int num) {
//        int factorial = 1;
//       for
//            factorial = factorial * element;
//        return factorial;
//    }
    public static void main(String[] args) {
        System.out.println(multiply(10));
        System.out.println(multiply(11));
    }
}
