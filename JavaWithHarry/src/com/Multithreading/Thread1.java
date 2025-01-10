package com.Multithreading;

public class Thread1 {
    //
    public static void main(String[] args) {
        Thread th = new Thread("Ram kishan");
        th.start();
        String str = th.getName();
        System.out.println(str);
    }
}
