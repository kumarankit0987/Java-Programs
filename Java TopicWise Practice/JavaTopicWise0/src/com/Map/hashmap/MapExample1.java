package com.Map.hashmap;
import java.util.HashMap;
import java.util.Map;

public class MapExample1 {
    public static void main(String[] args) {
        Map<Integer,String> student = new HashMap<>();
        student.put(121,"Ankit");
        student.put(122,"Aryan");
        student.put(123,"Raja");
        //When We store duplicate keys with different values it will replace the value
        student.put(121,"Abhay");
        // Traverse the student Map.
        // Map.Entry<> Interface .
        // entrySet() Method
       for(Map.Entry<Integer,String> m:student.entrySet()){
           System.out.println(m.getKey()+ " " +m.getValue());
       }
    }
}
