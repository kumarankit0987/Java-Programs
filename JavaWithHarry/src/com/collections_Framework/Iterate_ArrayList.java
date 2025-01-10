package com.collections_Framework;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterate_ArrayList {
    public static void main(String[] args) {
        // Create ArrayList
        ArrayList<String> fruits = new ArrayList<>();
        // Add Object to the ArrayList
        fruits.add("Orange");
        fruits.add("Mango");
        fruits.add("Pineapple");
        fruits.add("Grapes");
        fruits.add("Apple");
        //1- By using Iterator Interface
        System.out.println("Using Iterator interface");
        Iterator itr = fruits.iterator();
        while (itr.hasNext()) { // hasNext() method is use for checked the next element in ArrayList
            System.out.println(itr.next());
        }
        // 2- By using for each loop
        System.out.println("Using for each loop");
        for(String element : fruits) {
            System.out.println(element);
        }
        }
    }
