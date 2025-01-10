package com.hashcodeexample2;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        Set<User> s = new HashSet<>();
        s.add(new User("Ankit",121,"email1"));
        s.add(new User("Raga",11,"raga123@gamil.com"));
        s.add(new User("Bilal",12,"abhay983@gamil.com"));
        s.add(new User("Ankit",121,"email2"));
        s.add(new User("Raga",11,"raga123@gamil.com"));
        s.add(new User("Bilal",12,"abhay983@gamil.com"));

        System.out.println("Name  \t Id \t Email ");
        for(User elements : s) {
            System.out.println(elements.getName() + "\t" + elements.getId() + "\t" + elements.getEmail());
        }
        System.out.println("                  ");
        System.out.println("Sorted By Id");
        List<User> l = new ArrayList<>(s);
        Collections.sort(l,new IdComparator());
        System.out.println("Name  \t Id \t Email ");
        for(User elements : l) {
            System.out.println(elements.getName() + "\t" + elements.getId() + "\t" + elements.getEmail());
        }

        System.out.println("               ");
        System.out.println("Sorted By Name");
        Collections.sort(l,new NameComparator());
        System.out.println("Name  \t Id \t Email ");
        for(User elements : l) {
            System.out.println(elements.getName() + "\t" + elements.getId() + "\t" + elements.getEmail());
        }
    }
}
