package com.testing2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Abc {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        l.add(12);
        l.add(14);
        l.add(3);
        l.add(20);
        l.add(1);
        Collections.sort(l);
        System.out.println(l);
    }
}
