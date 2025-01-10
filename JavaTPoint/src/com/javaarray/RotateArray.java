package com.javaarray;

public class RotateArray {

    static void rotate(int[] arr){
        int temp;

        temp = arr[0];

        for(int i=1; i<arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        arr[arr.length-1] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        System.out.println("Before Rotation:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        rotate(arr);
        System.out.println();
        System.out.println("After Rotation:");
        for(int j : arr){
            System.out.print(j + " ");
        }
    }
}
