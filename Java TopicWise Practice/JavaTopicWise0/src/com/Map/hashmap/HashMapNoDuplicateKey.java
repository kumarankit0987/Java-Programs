package com.Map.hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapNoDuplicateKey {
    public static void main(String[] args) {
        HashMap<Integer,String> hm = new HashMap<>();
        hm.put(1,"Ankit");
        hm.put(2,"Rahul");
        hm.put(3,"Shiv");
        hm.put(4,"Shankar");
        hm.put(1,"Abhay"); // It will replace the value Ankit to Abhay on key 1.

        for(Map.Entry<Integer,String> m: hm.entrySet()){
            System.out.println(m.getKey() +" "+ m.getValue());
        }

    }
}
