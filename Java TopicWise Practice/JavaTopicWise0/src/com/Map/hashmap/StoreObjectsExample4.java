package com.Map.hashmap;

import java.util.HashMap;
import java.util.Map;

public class StoreObjectsExample4 {
    public static void main(String[] args) {

        Employee e1 = new Employee("Rebeca",121);
        Employee e2 = new Employee("Astonish",122);
        Employee e3 = new Employee("Raja",231);

        HashMap<Integer,Employee> objectHashMap = new HashMap<>();
        objectHashMap.put(11,e1);
        objectHashMap.put(111,e2);
        objectHashMap.put(121,e3);

        for(Map.Entry<Integer,Employee> m:objectHashMap.entrySet()){
            System.out.println(m.getKey() + " " + m.getValue());
        }

    }
}
class Employee {
    String name;
    int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
