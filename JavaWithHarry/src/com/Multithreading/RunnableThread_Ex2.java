package com.Multithreading;

public class RunnableThread_Ex2 implements Runnable {
    public void run() {
     for(int i = 1; i<=5; i++) {
         System.out.println(Thread.currentThread().getName()+ " " + i);
     }
    }
}
class Abc {
    public static void main(String[] args) {
        RunnableThread_Ex2 th1 = new RunnableThread_Ex2();
        RunnableThread_Ex2 th2 = new RunnableThread_Ex2();
        RunnableThread_Ex2 th3 = new RunnableThread_Ex2();
        Thread obj1 = new Thread(th1,"Ram");
        Thread obj2 = new Thread(th1,"Shyam");
        Thread obj3 = new Thread(th1,"Ankit");
        obj1.start();
        obj2.start();
        obj3.start();
        String str1 = obj1.getName();
        String str2 = obj2.getName();
        String str3 = obj3.getName();
        System.out.println("Str1 : " + str1);
        System.out.println("Str2 : " + str2);
        System.out.println("Str3 : " + str3);
    }
}
