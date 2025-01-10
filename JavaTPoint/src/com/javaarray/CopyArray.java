package com.javaarray;

public class CopyArray {
    public static void main(String[] args) {
        int[] arr1 = {1,4,7,9,6,10};
        int[] arr2 = arr1;

        System.out.println("Original Array:");
        for(int i=0; i<arr1.length; i++){
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
        System.out.println("Copied Array:");
        for(int i=0; i<arr2.length; i++){
            System.out.print(arr2[i] + " ");
        }
    }
}
