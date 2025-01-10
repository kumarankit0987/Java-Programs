package com.company;

public class CHW_Ch6_AverageMarksExample {
    public static void main(String[] args) {
        // WAP to calculate average marks from an array containing marks of all students
        // in physics using for each loop.
        int marks [] = {89,78,67,56};
        int sum = 0;
        for(int element : marks) {
            sum = sum + element;
        }
        System.out.println("The average vale :" + sum/ marks.length);
    }
}
