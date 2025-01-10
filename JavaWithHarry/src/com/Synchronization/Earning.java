package com.Synchronization;

class MyEarning extends Thread {
    int total = 0;

    public void run() {
        synchronized (this) {
            for (int i = 1; i <= 10; i++) {
                total = total + 100;
            }
            this.notify();
        }
    }
}
public class Earning {
    public static void main(String[] args) throws InterruptedException {
        MyEarning e = new MyEarning();
        e.start();
        synchronized (e) {
            e.wait();
            System.out.println("Total earning :" + e.total);
        }
    }
}
