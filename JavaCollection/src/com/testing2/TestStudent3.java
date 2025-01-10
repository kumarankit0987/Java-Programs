package com.testing2;

import java.util.*;

public class TestStudent3 {
    public static void main(String[] args) {
        Set<Student3> s1 = new HashSet<>();
        s1.add(new Student3("Raja",121,929290));
        s1.add(new Student3("Raja",122,929290));
        s1.add(new Student3("Raja",12,929290));
        s1.add(new Student3("Raja",101,929290));

        List<Student3> list = new ArrayList<>(s1);
        Collections.sort(list);
        for(int i =0; i<s1.size(); i++) {
            System.out.println(list.get(i).getName() + " " + list.get(i).getId() + " " + list.get(i).getMobileNo());
        }
    }
}
