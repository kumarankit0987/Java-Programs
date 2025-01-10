package com.CollectionOperations.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class DifferenceHashSetTreeSetLinkedHashSet {
    public static void main(String[] args) {
        //create Hashset
        Set<String> hs = new HashSet<>();
        hs.add("Prakash");
        hs.add("Raju");
        hs.add("Mandela");
        hs.add("Vicky");
        hs.add("Mukul");
        System.out.println("Elements of HashSet:..................");
        System.out.println(hs); // [Mandela, Vicky, Mukul, Raju, Prakash]unordered

        //Create TreeSet
        Set<String> ts = new TreeSet<>();
        ts.add("Prakash");
        ts.add("Raju");
        ts.add("Mandela");
        ts.add("Vicky");
        ts.add("Mukul");
        System.out.println("Elements of hs :..........................");
        System.out.println(ts);//[Mandela, Mukul, Prakash, Raju, Vicky]sorted

        //Create LinkedHashSet
        Set<String> lhs = new LinkedHashSet<>();
        lhs.add("Prakash");
        lhs.add("Raju");
        lhs.add("Mandela");
        lhs.add("Vicky");
        lhs.add("Mukul");
        System.out.println("Elements of linkedHashSet");
        System.out.println(lhs);//[Prakash, Raju, Mandela, Vicky, Mukul]ordered

    }
}
