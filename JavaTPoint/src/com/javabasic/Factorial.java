package com.javabasic;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int factorial = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();

        for(int i =1; i<=num; i++){
           factorial = factorial * i;
        }
        System.out.println("Factorial of" + " "+ num + " " + " is" + " " + factorial);
    }
}
