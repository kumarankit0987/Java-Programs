package com.company.multithreading.Practiceset13;

// WAP to print "good morning" and "welcome" continuously on the screen in java using Threads
class Thread1 extends Thread {
    public void run() {
        while(true) {
            System.out.println("good morning");
            System.out.println("Welcome");
        }
    }
}

class Thread2 extends Thread {
    public void run() {
        while(true) {
            System.out.println("welcome");
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
public class Que1 {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        t1.start();
        t2.start();
    }
}
