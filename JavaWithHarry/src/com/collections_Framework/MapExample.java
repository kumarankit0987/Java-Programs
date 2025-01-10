package com.collections_Framework;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put(101,"Ankit");
        map.put(102,"Ranjan");
        map.put(192,"Suraj");
        map.put(121,"Pankaj");
       // map.clear();
       // System.out.println(map.containsKey(101));
        //System.out.println(map.containsValue("Ranjan"));
        //System.out.println(map.entrySet());
        //map.replace(101,"Om prakash");
        System.out.println(map.size() );
        System.out.println(map);

    }
}
