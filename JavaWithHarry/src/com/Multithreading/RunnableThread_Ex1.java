package com.Multithreading;

class MyThread implements Runnable {
    public void run() {
        System.out.println("Thread is running");
    }
}
public class RunnableThread_Ex1 {
    public static void main(String[] args) {
        MyThread th = new MyThread();
        Thread obj = new Thread(th);
        obj.start();

    }
}
