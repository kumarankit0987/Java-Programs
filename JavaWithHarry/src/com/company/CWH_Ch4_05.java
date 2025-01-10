package com.company;

import java.util.Scanner;

public class CWH_Ch4_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Year");
        int year = sc.nextInt();
        if(year % 4 ==0 && year !=100 && year % 400==0) {
            System.out.println("Leap year");
        }
        else {
            System.out.println("Not Leap Year");
        }
    }
}
