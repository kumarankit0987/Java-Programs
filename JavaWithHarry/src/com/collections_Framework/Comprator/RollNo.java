package com.collections_Framework.Comprator;

import java.util.Comparator;

public class RollNo implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o2.getRollNo()-o2.getRollNo()
                ;
    }
}
