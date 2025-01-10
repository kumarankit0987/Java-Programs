package org.example;

import java.util.ArrayList;
import java.util.List;

public class SameElementArray {
    public static void main(String[] args) {
        int[] arr1 = {12,14,65,23,10};
        int[] arr2 = {13,15,16,12,10,23};
        List<Integer> list = new ArrayList<>();

        for (int k : arr1) {
            for (int i : arr2) {
                if (k == i) {
                    list.add(k);
                    break;
                }
            }
        }
        System.out.println(list);
    }
}
