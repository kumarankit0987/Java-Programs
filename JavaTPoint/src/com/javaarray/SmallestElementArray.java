package com.javaarray;

public class SmallestElementArray {
    public static void main(String[] args) {
        int min;
        int[] arr = {2,4,6,7,19,1};
        min = arr[0];

        for(int i : arr){
           if(i<min){
               min = i;
           }
        }
        System.out.println(min);
    }

}

