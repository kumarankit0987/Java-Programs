package com.collection.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(112);
        list.add(43);
        list.add(594);
        list.add(67);
        list.add(11);

        //Original List
        System.out.println(list);
        //After Sorting
        System.out.println("------------");
        Collections.sort(list);
        System.out.println(list);
    }
}
