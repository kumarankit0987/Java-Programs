package com.testing2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>();
        l1.add(12);
        l1.add(12);
        l1.add(13);
        l1.add(15);
        l1.add(155);
        Collections.sort(l1);
       for(int i=0; i<l1.size(); i++) {
           System.out.println(l1.get(i));
       }
    }
}
