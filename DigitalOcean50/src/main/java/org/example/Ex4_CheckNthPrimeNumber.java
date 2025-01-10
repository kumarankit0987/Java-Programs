package org.example;

import java.util.Scanner;

public class Ex4_CheckNthPrimeNumber {

    public static void main(String[] args) {
        int i; int count; int total = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();

        for(i = 1; i<=num; i++) {
            count=0;
           for(int j=1; j<=i; j++) {
               if(i % j == 0) {
                   count = count + 1;
               }
           }
            if(count == 2) {
                System.out.println(i);
                total++;

            }
        }
        System.out.println("Total prime number is" + " " + total);
    }
}
