package org.example;

public class Ex18_SumAllElementsArray {
    public static void main(String[] args) {
        int[] arr = {12,23,54,65,87,54,34,32};
        int sum =0;
        for(int i=0; i<=arr.length-1; i++) {
            sum = sum + arr[i];
        }
        System.out.println(sum);
    }
}
