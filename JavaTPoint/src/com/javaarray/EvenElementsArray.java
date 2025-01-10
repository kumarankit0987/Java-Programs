package com.javaarray;

public class EvenElementsArray {
    public static void main(String[] args) {
        int[] arr = {12, 34, 67, 3, 21, 13, 16, 24, 31};

        for(int i=0; i<arr.length; i=i+2){
            System.out.print(arr[i] + " ");
        }
    }
}
