package com.company;

public class ReturnValueMethod {
    static int sum(int x, int y) { // As we see use int for return type
        int sum = x + y;
        return sum;
    }

    public static void main(String[] args) {
       // int a = 10;
       // int b = 19;
       // sum(a,b);
      //  System.out.println(sum(a,b));
        // we can directly enter the arguments in method without using refrencessssss like a and b
        // And print the sum
        System.out.println(sum(10,19));
    }
}
