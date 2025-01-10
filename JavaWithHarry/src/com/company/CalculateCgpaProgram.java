package com.company;

import java.util.Scanner;

public class CalculateCgpaProgram {
    public static void main(String[] args) {
        // WAP to calculate CGPA using marks of three Subjects(out of 100).
        int totalMarks = 300;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first subject marks :");
        float sub1 = sc.nextFloat();
        System.out.println("Enter second subject marks");
        float sub2 = sc.nextFloat();
        System.out.println("Enter third marks");
        float sub3 = sc.nextFloat();
        float scoredMarks = sub1 + sub2 + sub3;
        float percentage = scoredMarks/totalMarks * 100;
        float cgpa = percentage/9.5f;
        System.out.println("Cgpa : " + cgpa);
    }
}
