package com.company;

public class Array {
    public static void main(String[] args) {
        // define an Array
        int arr [] = new int[5];
        // set the value in Array
        arr[0] = 12;
        arr[1] = 14;
        arr[2] = 18;
        arr[3] = 11;
        arr[4] = 10;
        arr[4] = 56;
        // Now we will Access the element of array from index number
        System.out.println(arr[3]);
        // Override or change the value of array
        System.out.println(arr[4]);
        // We can see the value of arr[4] was 10 after overriding that value is 56;
    }
}
