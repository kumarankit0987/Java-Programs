package com.company;

import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {
        // Wap to take input from user and if age is equal to and greater than 18 then print adult otherwise Not adult.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age");
        int age = sc.nextInt();
        if(age >= 18) {
            System.out.println("Adult");
        }
        else {
            System.out.println(" Not adult ");
        }
    }
}
