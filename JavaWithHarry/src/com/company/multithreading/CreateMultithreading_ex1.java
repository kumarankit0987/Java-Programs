package com.company.multithreading;
// create a thread
class MyThread1 extends Thread {
    @Override
    public void run() {
        System.out.println(getName());
        int sum =0;
        int i =1;
        while(i<=60){
            sum = sum + i;
            System.out.println(getName() + " " + sum);
            i++;
        }

    }
}
class MyThread2 extends Thread {
    @Override
    public void run() {
        System.out.println(getName());
        int sum =0;
        int i =61;
        while(i<=100) {
            sum = sum + i;
            System.out.println(getName() + " " + sum);
            i++;
        }
    }
}
public class CreateMultithreading_ex1 {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        t1.start();
        t2.start();

    }
}
