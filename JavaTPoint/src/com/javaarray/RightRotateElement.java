package com.javaarray;

public class RightRotateElement {
    public static void main(String[] args) {
        int temp;
        int[] arr = {1,2,3,4,5,6,7};
//        arr[0] = arr[arr.length-1];
//        temp = arr[0];

        for(int i=0; i<arr.length-1; i++){
             arr[i+1] = arr[i];
        }
//        for(int i=0; i<=arr.length; i++){
//            System.out.print(arr[i] + " ");
//        }

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
