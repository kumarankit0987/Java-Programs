package com.collections_Framework;

import java.util.ArrayList;
import java.util.Collections;

public class Sorting_ArrayList {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        // Add Object to the ArrayList
        fruits.add("Orange");
        fruits.add("Mango");
        fruits.add("Pineapple");
        fruits.add("Grapes");
        fruits.add("Apple");

        // sort the ArrayList
        Collections.sort(fruits); 
        System.out.println(fruits);
    }
}
