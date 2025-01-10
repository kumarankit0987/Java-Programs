package com.Map.TreeMap;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Example2 {
    public static void main(String[] args) {
        Animal dog1 = new Animal("Bobby","German");
        Animal dog2 = new Animal("Lucy","Rototiller");
        Animal dog3 = new Animal("Ctl","Street");

        Map<Integer,Animal> tm = new TreeMap<>();
        tm.put(1,dog1);
        tm.put(8,dog2);
        tm.put(7,dog3);
        for(Map.Entry<Integer,Animal> m:tm.entrySet()){
            System.out.println(m.getKey() + " "+m.getValue());
        }
    }
}
class Animal {
    String name;
    String breed;

    public Animal(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", breed='" + breed + '\'';
    }
}
