package com.Map.TreeMap;

import java.util.Map;
import java.util.TreeMap;

public class Example1 {
    public static void main(String[] args) {

        Map<Integer,String> tm = new TreeMap<>();
        tm.put(121,"Ball");
        tm.put(213,"Apple");
        tm.put(132,"Cat");
        tm.put(4,"Kite");

        for(Map.Entry<Integer,String> entry: tm.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }
}
