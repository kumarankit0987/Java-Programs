package com.basicInterviewQuestions;

import java.util.Scanner;

public class SumNNumbers {
    public static void main(String[] args) {
// Wap to print sum of n even number using while loop.
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n ");
        int n = sc.nextInt();
        for(int i =1; i<=n; i++) {
            if(i%2==0)
            sum = sum + i;
           // System.out.println(i);
        }
        System.out.println(sum);
        }
    }
