package com.javaarray;

public class LargestElementArray {
    public static void main(String[] args) {
        int max;
        int[] arr = {2,4,6,7,19,56};
        max = arr[0];

        for (int j : arr) {
            if (j > max) {
                max = j;
            }
        }
        System.out.println(max);
    }
}
