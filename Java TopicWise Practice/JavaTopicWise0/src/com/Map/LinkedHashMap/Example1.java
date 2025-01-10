package com.Map.LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class Example1 {
    public static void main(String[] args) {
        Map<Integer,String> lhm = new LinkedHashMap<>();
        lhm.put(111,"Mercedes");
        lhm.put(121,"Defender");
        lhm.put(131,"BMW");
        lhm.put(141,"Jaguar");

        for(Map.Entry<Integer,String> car: lhm.entrySet()){
            System.out.println(car.getKey() + " " + car.getValue());
        }
    }
}
