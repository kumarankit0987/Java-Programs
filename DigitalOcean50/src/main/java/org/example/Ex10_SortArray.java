package org.example;

import java.util.Arrays;

public class Ex10_SortArray {
    public static void main(String[] args) {
        int[] arr = {12,98,10,2,-9,7,5,87,21,76,-524};
        Arrays.sort(arr);
        for(int i =0; i<=arr.length-1; i++) {
            System.out.print(arr[i] + " " + ",");
        }
    }
}
