package com.company.multithreading;
class MyThread01 extends Thread {
    public void run() {
       int i =0;
       while(i<=100) {
           System.out.println("My thread1 is for cooking");
           i++;
       }
    }
}
class MyThread02 extends Thread {
    @Override
    public void run() {
        int i = 0;
        while (i <= 100) {
            System.out.println("My thread2 is for chatting");
            i++;
        }
    }
}

public class Multithreading_ex2 {
    public static void main(String[] args) {
        MyThread01 obj = new MyThread01();
        MyThread02 obj1 = new MyThread02();
        obj.start(); obj1.start();
    }
}
