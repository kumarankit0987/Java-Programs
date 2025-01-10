package com.Multithreading;

class A extends Thread {
    public void run() {
      //  System.out.println("I am a thread to create using extends keyword");
        for(int i =1; i<=5; i++) {
            System.out.println(Thread.currentThread().getName() +"  Ankit" + i);
        }
    }
}
public class Create_Thread_Using_extends {
    public static void main(String[] args) {
            A obj = new A();
            obj.start();
        }
    }
