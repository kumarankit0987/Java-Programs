package com.javaarray;

public class SumElementArray {
    public static void main(String[] args) {
        int sum =0;
        int[] arr1 = {1,4,7,9,6,10};

        for(int i : arr1){
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
