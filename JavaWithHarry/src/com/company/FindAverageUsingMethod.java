package com.company;

public class FindAverageUsingMethod {
    // Write a function to find average of a set of numbers passed as arguments.
    static int average(int ...arr) {
        int sum =0;
        int avr =1;
        for(int element : arr) {
             sum = sum + element;
        }
        avr = sum/ arr.length; // update the value .

        return avr;
    }

    public static void main(String[] args) {

        int result=average(10,9,8,7,6,5,4,3,2);// call the average function and store in result variablr
        // function return the avr so result is avr
        System.out.println(result); // output is 6 which return average function
    }
}
