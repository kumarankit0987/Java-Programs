package com.Comprator_Comparable2;

import java.util.Comparator;

public class IdComparator implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
         if(o1.getId()==o2.getId())
            return 0;
        else if (o1.getId()>o2.getId())
            return 1;
        else
            return -1;
    }
}
