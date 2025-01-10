package com.hashcodeAndequals;

import java.util.Comparator;

public class PriceComparator implements Comparator<Item> {
    @Override
    public int compare(Item o1, Item o2) {
        return (int) (o1.getPrice()-o2.getPrice());
    }
}
