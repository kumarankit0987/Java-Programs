package com.collections_Framework;

import java.util.ArrayList;

public class Get_Set_ArrayList {
    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<Integer> al = new ArrayList<>();
        // Add elements to the ArrayList in Java
        al.add(12);
        al.add(72);
        al.add(42);
        al.add(22);
        System.out.println(al.set(1,30));//changing the element at index 1 using set method
        System.out.println(al); // output is [12,30,42,22]

        // Accessing the element using get method
        System.out.println(al.get(2)); // output is 42
    }
}
