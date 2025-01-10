package com.CollectionOperations;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListIteratorExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        //Using add() method to add the elements.
        list.add(122);
        list.add(123);
        list.add(56);
        list.add(234);
        list.add(54);
        list.add(56);

        // Iterate using Iterator
//        ListIterator<Integer> itr = list.listIterator();
//        while(itr.hasNext()) {
//            System.out.println(itr.next());
//        }

        // Using for each loop
        for(Integer numbers:list);
       // System.out.println(numbers);
    }
}
