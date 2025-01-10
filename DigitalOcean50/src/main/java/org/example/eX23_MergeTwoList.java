package org.example;

import java.util.ArrayList;
import java.util.List;

public class eX23_MergeTwoList {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(121);
        list1.add(213);
        list1.add(124);
        list1.add(122);
        list1.add(129);

        List<Integer> list2 = new ArrayList<>();
        list2.add(190);
        list2.add(120);
        list2.add(130);

        list2.addAll(list1);
        System.out.println(list2);

    }
}
