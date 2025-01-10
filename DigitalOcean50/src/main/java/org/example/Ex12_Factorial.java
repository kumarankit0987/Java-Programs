package org.example;

public class Ex12_Factorial {
    public static void main(String[] args) {
        int no = 7;
        int factorial = 1;
        for(int i=1; i<no; i++) {
            factorial = factorial * (i+1);
        }
        System.out.println(factorial);
    }
}
