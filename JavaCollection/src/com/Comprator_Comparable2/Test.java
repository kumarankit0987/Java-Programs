package com.Comprator_Comparable2;

import java.util.*;
import java.sql.*;

public class Test {
    public static void main(String[] args) {
        Set<Product> s = new HashSet<>();
        s.add(new Product("Air-phone",121));
        s.add(new Product("Mobile",23));
        s.add(new Product("Charger",14));
        s.add(new Product("Air-phone",121));
        s.add(new Product("Mobile",23));
        s.add(new Product("Charger",14));

        System.out.println("Original Set :");
        System.out.println("Name  \t Id  ");
        for(Product elements : s) {
            System.out.println(elements.getName() +"\t" + elements.getId());
        }

        System.out.println("Sorted By name");
        //we change the set into list because we can't sort directly a set
        List<Product> list = new ArrayList<>(s);
        Collections.sort(list,new NameComparator());
        System.out.println("Name  \t Id  ");
        for(Product elements : list) {
            System.out.println(elements.getName() +"\t" + elements.getId());
        }

        System.out.println("sorted By Id");
        Collections.sort(list,new IdComparator());
        for(Product elements : list) {
            System.out.println(elements.getName() +"\t" + elements.getId());
        }

    }
}
