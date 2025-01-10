package com.company;

import java.util.Scanner;

public class InputFromUser {
    public static void main(String[] args) {
        // Create a Object 'sc' of Scanner class for take input from User.
        Scanner sc = new Scanner(System.in); // Scanner is a class which lie in java.util package.
        // Add Two number to take from user
        System.out.println("Enter number1");
        int number1 = sc.nextInt();
        System.out.println("Enter number2");
        int number2 = sc.nextInt();;
        int sum = number1 + number2;

        System.out.print("Sum of Two Number: ");
        System.out.println(sum);

    }
}
