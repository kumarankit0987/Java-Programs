package com.comparatorEx3;

import java.util.HashSet;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        Set<Product> set = new HashSet<>();//hash code use for follow insertion order
        set.add(new Product("Mobile","Samsung",121));
        set.add(new Product("Fan","Samsung",121));
        set.add(new Product("AC","Samsung",121));
        set.add(new Product("Chair","Milton",121));
        set.add(new Product("Charger","mi",121));


    }
}
