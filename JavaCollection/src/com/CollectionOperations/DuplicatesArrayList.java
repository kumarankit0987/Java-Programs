package com.CollectionOperations;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class DuplicatesArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        //Using add() method to add the elements.
        list1.add(122);
        list1.add(123);
        list1.add(56);
        list1.add(234);
        list1.add(54);
        list1.add(56);

        System.out.println(list1.toString());

        //Remove Duplicates
        Set<Integer> s = new HashSet<>(list1);
        System.out.println(s.toString());
    }
}
