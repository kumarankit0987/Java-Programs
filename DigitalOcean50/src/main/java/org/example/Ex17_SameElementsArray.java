package org.example;

import java.util.ArrayList;
import java.util.List;

public class Ex17_SameElementsArray {
    public static void main(String[] args) {
        int[] arr1 = {12,87,42,56,31,11,8,9};
        int[] arr2 = {31,8,9,42,12,65,87,20};
        List<Integer> list = new ArrayList<>();

        for(int i=0; i<=arr1.length-1; i++) {
            for(int j=0; j<=arr2.length-1; j++){
                if(arr1[i] == arr2[j]) {
                    list.add(arr1[i]);
                    break;
                }
            }
        }
        System.out.println(list);
    }
}
