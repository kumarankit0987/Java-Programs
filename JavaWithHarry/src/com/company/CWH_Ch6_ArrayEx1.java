package com.company;

public class CWH_Ch6_ArrayEx1 {
    public static void main(String[] args) {
        // Create an array of 5 floats and calculate their sum
        float arr [] ={5,6,7,8,4};
        float sum = 0;
        for(int i =0; i<arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println(sum);
    }
}
