package com.Map.hashmap;

import java.util.*;

public class Example2 {
    public static void main(String[] args) {

        // HashMap doesn't follow any Insertion Order
        Map<Integer,String> hm = new HashMap<>();
        hm.put(121,"Apple");
        hm.put(321,"Orange");
        hm.put(432,"Banana");
        hm.put(213,"Mango");

        //System.out.println(hm);
        System.out.println("HashMap");
        for(Map.Entry<Integer,String> m : hm.entrySet()){
            System.out.println(m);
        }

        //LinkedHashMap follow the Insertion Order
        System.out.println("LinkedHashMap");
        System.out.println("-------------------------------------");
        Map<Integer,String> lhm = new LinkedHashMap<>();
        lhm.put(23,"Raja");
        lhm.put(43,"Ankit");
        lhm.put(32,"Shiv");
        lhm.put(56,"Priya");

        for(Map.Entry<Integer,String> elements : lhm.entrySet()){
            System.out.println(elements);
        }

        System.out.println("TreeMap");
        System.out.println("-----------------------------------------");

        //Treemap follow the ascending Order
        Map<Integer,String> tm = new TreeMap<>();
        tm.put(121,"Samsung");
        tm.put(321,"Redmi");
        tm.put(441,"Vivo");
        tm.put(231,"Iphone");

        for(Map.Entry<Integer,String> elements : tm.entrySet()){
            System.out.println(elements);
        }
    }
}
