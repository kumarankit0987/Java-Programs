package com.company;

import java.util.Scanner;

public class PercentageCalculatorProgram {
    // Create Object of Scanner class to take input from user
    public static void main(String[] args) {
        int totalMarks = 500;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first subject of marks :");
        float sub1 = sc.nextFloat();
        System.out.println("Enter the first subject of marks :");
        float sub2 = sc.nextFloat();
        System.out.println("Enter the first subject of marks :");
        float sub3 = sc.nextFloat();
        System.out.println("Enter the first subject of marks :");
        float sub4 = sc.nextFloat();
        System.out.println("Enter the first subject of marks :");
        float sub5 = sc.nextFloat();

        float totalScoredMarks = sub1 + sub2 + sub3 + sub4 + sub5;
        System.out.println("Total Marks:" + totalScoredMarks);
        float percentage = totalScoredMarks/totalMarks * 100 ;
        System.out.println("Total Percentage :" + percentage);

    }
}
