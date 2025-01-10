package com.CollectionOperations.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class SynchronizeArraylist {
    public static void main(String[] args) {
        ArrayList<String> fruitList = new ArrayList<>();
        fruitList.add("Mango");
        fruitList.add("Banana");
        fruitList.add("Apple");
        fruitList.add("Strawberry");
        fruitList.add("Pineapple");

        //Synchronize the arraylist
        fruitList = (ArrayList<String>) Collections.synchronizedList(fruitList);

    }
}
