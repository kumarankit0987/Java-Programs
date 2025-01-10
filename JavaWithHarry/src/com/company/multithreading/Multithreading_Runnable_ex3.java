package com.company.multithreading;


class MyThreadRunnable1 implements Runnable {
    public void run() {
        int i = 1;
        while (i <= 100) {
            System.out.println("I am a thread1  ");
            i++;
        }
    }
}
class MyThreadRunnable2 implements Runnable {

    @Override
    public void run() {
        int i = 1;
        while (i <= 100) {
            System.out.println("I am thread2 ");
            i++;
        }
    }
}
public class Multithreading_Runnable_ex3 {
    public static void main(String[] args) {
        MyThreadRunnable1 bullet1 = new MyThreadRunnable1();
        Thread gun1 = new Thread(bullet1);

        MyThreadRunnable2 bullet2 = new MyThreadRunnable2();
        //t1.start();
        //t2.start();// we can't run directly start method on Runnable interface
        Thread gun2 = new Thread(bullet2);
        gun1.start();
        gun2.start();

    }
}
