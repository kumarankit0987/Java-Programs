package com.ArrayTPoint;

public class CopyAllElementsOneToAnotherArray {
    public static void main(String[] args) {
        int[] arr = new int[4];
        int[] arr1 = arr;
        arr[0]=12;
        arr[2]=23;
        arr[1]=10;
        arr[3]=45;
        System.out.println("Original Array");
        for(int i:arr){
            System.out.println(i);
        }
        System.out.println("Copied Array");
        for (int j : arr) {
            System.out.println(j);
        }
    }
}
