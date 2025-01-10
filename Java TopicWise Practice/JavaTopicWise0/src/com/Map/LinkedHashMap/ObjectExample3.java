package com.Map.LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class ObjectExample3 {
    public static void main(String[] args) {

        Mobile mobile1 = new Mobile(121,"Samsung","A111");
        Mobile mobile2 = new Mobile(131,"Oppo","ope231");
        Mobile mobile3 = new Mobile(141,"Apple","Iphone 15 pro max");

        Map<Integer,Mobile> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(1,mobile1);
        linkedHashMap.put(2,mobile2);
        linkedHashMap.put(3,mobile3);

        for(Map.Entry<Integer,Mobile> mobile:linkedHashMap.entrySet()){
            System.out.println(mobile.getKey() + " " +mobile.getValue());
        }
    }
}
class Mobile {
    int id;
    String brand;
    String Model;

    public Mobile(int id, String brand, String model) {
        this.id = id;
        this.brand = brand;
        Model = model;
    }

    @Override
    public String toString() {
        return
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", Model='" + Model + '\'';
    }
}
