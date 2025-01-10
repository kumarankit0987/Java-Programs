package com.testing2;

import java.util.Set;

public class Student3 implements Comparable<Student3> {
    private  String name;
    private int id;
    private int mobileNo;

    public Student3(String name, int id, int mobileNo) {
        this.name = name;
        this.id = id;
        this.mobileNo = mobileNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(int mobileNo) {
        this.mobileNo = mobileNo;
    }

    @Override
    public int compareTo(Student3 o) {
        if(this.id==o.id) {
            return 0;
        } else if (this.id>o.id) {
           return 1;
        }
        else {
            return -1;
        }
    }
}
