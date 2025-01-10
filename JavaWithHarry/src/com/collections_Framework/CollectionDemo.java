package com.collections_Framework;

import java.util.ArrayList;

public class CollectionDemo {
    public static void main(String[] args) {
        ArrayList al1 = new ArrayList();
        al1.add("Ram");
        al1.add("Shyam");
        al1.add("Kabir");
        System.out.println(al1);

        ArrayList al2 = new ArrayList();
        al2.add(101);
        al2.add(102);
        al2.add(103);
        System.out.println(al2);

         al1.addAll(al2);
        System.out.println(al1);

        System.out.println(al1.contains("Ram"));

        System.out.println(al1.isEmpty());

        System.out.println(al1.remove(1));
        System.out.println(al1);

        System.out.println(al1.get(3));


    }
}
