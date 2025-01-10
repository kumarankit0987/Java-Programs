package org.example;

import java.util.Scanner;

public class Ex5_FibonacciSeries {
    public static void main(String[] args) {
        int a = 0; int b = 1; int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();
        for(int i = 1; i<=num; i++) {
            System.out.println(sum);
            a=b;
            b=sum;
            sum = a + b;
        }
    }
}
