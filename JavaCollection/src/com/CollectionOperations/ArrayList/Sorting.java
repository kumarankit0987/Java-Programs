package com.CollectionOperations.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Sorting {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Ram");
        list.add("Shyam");
        list.add("Ankit");
        list.add("Babu");
        Collections.sort(list);
        System.out.println(list);
    }
}
