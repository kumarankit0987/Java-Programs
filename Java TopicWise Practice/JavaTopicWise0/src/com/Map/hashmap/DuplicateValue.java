package com.Map.hashmap;

import java.util.HashMap;
import java.util.Map;

public class DuplicateValue {
    public static void main(String[] args) {
        //Store Duplicate Values in HashMap
        Map<String,Integer> hm = new HashMap<>();
        hm.put("Ram",1);
        hm.put("Ankit",2);
        hm.put("Rahul",1);

        for(Map.Entry<String,Integer> entry: hm.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
