package com.company.multithreading;

class MyThr extends Thread {
    public MyThr(String name) {
        super(name);
    }
    public void run() {
        int i =1;
        while(i<=10000000000000l) {
            System.out.println("Name is " + getName());
            i++;
        }
    }
}
public class Multithreading_Constructor_ex4 {
    public static void main(String[] args) {
        MyThr obj1 = new MyThr("Ankit");
        MyThr obj2 = new MyThr("Rakesh");
        MyThr obj3 = new MyThr("Mukesh");
        MyThr obj4 = new MyThr("kush");
        MyThr obj5 = new MyThr("Harsh is (most important)");
        obj5.setPriority(Thread.MAX_PRIORITY); // if we give the priority of any constructor then use this method of thread
        obj1.setPriority(Thread.MIN_PRIORITY);
        obj1.start();
        obj2.start();
        obj3.start();
        obj4.start();
        obj5.start();
        System.out.println("The id no is " + obj1.getId());
        System.out.println("The id no is " + obj2.getId());
        System.out.println("The id no is " + obj3.getId());
        System.out.println("The id no is " + obj4.getId());
        System.out.println("The id no is " + obj5.getId());

    }
}
