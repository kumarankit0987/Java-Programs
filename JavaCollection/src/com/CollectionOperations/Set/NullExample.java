package com.CollectionOperations.Set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class NullExample {
    public static void main(String[] args) {
        Set<String> s = new HashSet<>();
        s.add(null);
        System.out.println(s);

        Set<String> ts= new TreeSet<>();
        ts.add(null);
        System.out.println(ts); // its throw an exception because treeSet not allowed to store null value/

    }
}
