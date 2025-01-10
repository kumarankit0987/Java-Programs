package com.collections_Framework;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        hs.add(100);
        hs.add(121);
        hs.add(132);
        hs.add(2121);

        System.out.println(hs);

    }
}
