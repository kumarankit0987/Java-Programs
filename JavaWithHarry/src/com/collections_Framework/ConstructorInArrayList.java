package com.collections_Framework;

import java.util.ArrayList;

public class ConstructorInArrayList {
    public static void main(String[] args) {
        // Create non-generic ArrayList
//        ArrayList al1 = new ArrayList();
//
//        al1.add(100);
//        al1.add(299);
//        al1.add(102);
//        al1.add(103);
//
//        ArrayList al2 = new ArrayList(al1);
//        System.out.println(al2);
        ArrayList<Integer> al = new ArrayList<>(100);
        System.out.println(al);


    }
}
