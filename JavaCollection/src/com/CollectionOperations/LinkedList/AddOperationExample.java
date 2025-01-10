package com.CollectionOperations.LinkedList;

import java.util.LinkedList;

public class AddOperationExample {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Ram");
        list.add("Shyam");
        list.add("Ankit");
        list.add("Aman");
        System.out.println(list);

        //Add element at particular index
        list.add(3,"Raja");
        System.out.println(list);

        LinkedList<String> list2 = new LinkedList<>();
        list2.add("Ajit");
        list2.add("Shreya");
        list2.add("Amit");
        list2.add("Abhay");

        list2.addAll(list);
        System.out.println(list2);
    }
}
