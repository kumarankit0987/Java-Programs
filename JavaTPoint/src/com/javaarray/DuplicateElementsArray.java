package com.javaarray;

public class DuplicateElementsArray {
    public static void main(String[] args) {
        int[] arr = new int[]{7,9,6,3,7,1,6,4,2,3,1};

        for(int i =0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                if(arr[i] == arr[j])
                    System.out.print(arr[j] + " ");

            }
        }
    }
}
