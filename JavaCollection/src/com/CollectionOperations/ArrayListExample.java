package com.CollectionOperations;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        //Create ArrayList
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        //Using add() method to add the elements.
        list1.add(122);
        list1.add(123);
        list1.add(56);
        list1.add(234);
        list1.add(54);
        list1.add(56);

        System.out.println(list1);

        //add element on particular index
        list1.add(4,23);
        System.out.println(list1);

        //create another arraylist
        ArrayList<Integer> list2 = new ArrayList<>(list1);
        list2.add(124);
        System.out.println(list2);
        System.out.println(list2.get(5));
    }
}
