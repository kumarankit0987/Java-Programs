package com.Comparator_Comparable;

import java.util.Comparator;

public class NameComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if(o1.name.equals(o2.name)){
            if(o1.rollNo>o2.rollNo){
                return 1;
            }else if(o1.rollNo==o2.rollNo){
                return 0;
            }else {
                return -1;
            }
        }
        else {
            return o1.name.compareTo(o2.name);
        }

    }
}
