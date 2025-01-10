package com.Map.LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class NoDuplicateValuesExample2 {
    public static void main(String[] args) {
        //Store Duplicate Values in LinkedHashmap
        //Store Duplicate Keys. but it will replace the value.
        Map<String,Integer> lhm = new LinkedHashMap<>();
        lhm.put("Laptop",111);
        lhm.put("MackBook",121);
        lhm.put("Mobile",131);
        lhm.put("Iphone",141);
        lhm.put("MackBook",151);//Replace with 151
        lhm.put("Watch",111);

        for(Map.Entry<String,Integer> accessories: lhm.entrySet()){
            System.out.println(accessories.getKey() + " " + accessories.getValue());
        }
    }
}
