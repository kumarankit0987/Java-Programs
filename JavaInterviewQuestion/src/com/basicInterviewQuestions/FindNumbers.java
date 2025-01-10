package com.basicInterviewQuestions;

public class FindNumbers {
    // How to find the largest and smallest number in an unsorted integer array
    public static void main(String[] args) {
        int arr [] = {2,6,4,3,5,9};
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
       for(int i =0; i<arr.length; i++) {
          max=Math.max(max,arr[i]);
          min=Math.min(min,arr[i]);

       }
        System.out.println(max);
    }
}
