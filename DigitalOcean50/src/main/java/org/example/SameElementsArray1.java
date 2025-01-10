package org.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.IntStream;

public class SameElementsArray1 {
    public static void main(String[] args) {
        int[] arr1 = {12,87,42,56,31,11,8,9};
        int[] arr2 = {31,8,9,42,12,65,87,20};


        Set<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        for (int e : arr1) {
            set.add(e);
        }
        for (int i : arr2) {
            if (set.contains(i)) {
                list.add(i);
            }
        }
        System.out.println(list);

    }
}
