package com.Map.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample3 {
    public static void main(String[] args) {
        Map<Integer,String> hm = new HashMap<>();
        hm.put(1,"Apple");
        hm.put(2,"Banana");
        hm.put(3,"Grapes");
        hm.put(5,"WaterMelon");

       //Now Traverse the Map
        //First we need to change the map into set using entrySet() method.
//        System.out.println("Traverse the map by using iterator");
//        Set set = hm.entrySet();//Converting to Set so that can we traverse
//        Iterator itr = set.iterator();
//        while(itr.hasNext()){
//            Map.Entry entry = (Map.Entry)itr.next();
//            System.out.println(entry.getKey()+ " " +entry.getValue());
//        }

        //System.out.println("Traverse the map by using for each");
        for(Map.Entry<Integer,String> m :hm.entrySet() ){
            System.out.println(m.getKey() + " " + m.getValue());
        }

    }
}
