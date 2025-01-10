package com.collections_Framework.Comprator;

import java.util.Comparator;

public class Student implements Comparator<Student> {
    private String name;
    private int rollNo;
    private long mobileNO;

    @Override
    public int compare(Student o1, Student o2) {
        return 0;
    }

    public Student(String name, int rollNo, long mobileNO) {
        this.name = name;
        this.rollNo = rollNo;
        this.mobileNO = mobileNO;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public long getMobileNO() {
        return mobileNO;
    }

    public void setMobileNO(long mobileNO) {
        this.mobileNO = mobileNO;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNo=" + rollNo +
                ", mobileNO=" + mobileNO +
                '}';
    }
}
