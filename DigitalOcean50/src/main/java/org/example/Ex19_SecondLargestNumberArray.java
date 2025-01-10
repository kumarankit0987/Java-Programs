package org.example;

public class Ex19_SecondLargestNumberArray {
    public static void main(String[] args) {
        int[] arr = {10,87,23,11,8,54,100};
        int max = arr[0];
        int max2 = arr[0];
        for (int j : arr) {
            if (max < j) {
                max2 = max;
                max = j;
            }
        }
        System.out.println(max);
        System.out.println(max2);
    }
}
