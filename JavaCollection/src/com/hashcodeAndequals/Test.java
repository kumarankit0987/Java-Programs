package com.hashcodeAndequals;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        Set<Item> s1 = new HashSet<>();
        s1.add(new Item("a", 12, "Samsung",15000L, "Abc", "bcd"));
        s1.add(new Item("c", 14, "Apple",  1500L,  "Cca", "cda"));
        s1.add(new Item("b", 11, "vivo",   50000L, "Bnc", "acd"));
        s1.add(new Item("a", 12, "Samsung",15000L, "Abc", "bcd"));
        s1.add(new Item("c", 14, "Apple",  1500L,  "Cca", "cda"));
        s1.add(new Item("b", 11, "vivo",   50000L, "Bnc", "acd"));

        List<Item> l1 = new ArrayList<Item>(s1);

        print(s1);
        sort(l1,new NameComparator(),"Name");
        sort(l1,new CategoryComparator(),"Category");
        sort(l1,new PriceComparator(),"Price");

    }
    public static void print(Set<Item> items) {
        System.out.println("Original set :");
        System.out.println("Name \t Id \t Brand \t Price \t Category \t SubCategory");
        for(Item elements : items) {
            System.out.println(elements.getName() + " \t " + elements.getId()+ "    " +  elements.getBrand() + "   " + elements.getPrice() + "    "    + elements.getCategory() + " "    +elements.getSubCategory());
        }

    }
    public static void sort(List<Item> s1, Comparator<Item> cm, String sort) {
       // List<Item> l1 = new ArrayList<Item>(s1);
        Collections.sort(s1,cm);
        System.out.println("Sorted By " + sort);
        System.out.println("Name \t Id \t Brand \t Price \t Category \t SubCategory");
        for(Item elements : s1) {
            System.out.println(elements.getName() + "\t" + elements.getId() + "\t" +  elements.getBrand() +"\t" + elements.getPrice() + "\t" + elements.getCategory() + "\t" + elements.getSubCategory());
        }
    }

}

