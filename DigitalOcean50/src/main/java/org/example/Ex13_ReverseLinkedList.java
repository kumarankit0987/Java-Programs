package org.example;

import java.util.LinkedList;
import java.util.List;

public class Ex13_ReverseLinkedList {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(121);
        list.add(122);
        list.add(123);
        list.add(124);
        list.add(125);
        list.add(126);

        for(Integer e : list) {
            System.out.println(e);
        }
    }
}
