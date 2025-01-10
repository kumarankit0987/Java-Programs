package com.Multithreading;

class TestSleep0_Method2 extends Thread {
    public void run() {
        for(int i = 1; i<10; i++) {
            try {
                Thread.sleep(1000);
            }
            catch(InterruptedException e) {
                System.out.println(e);
            }
            System.out.println(Thread.currentThread().getName() +" " + i);
        }
    }
}
public class TestSleep_Method2 {
    public static void main(String[] args) {
        TestSleep0_Method2 obj1 = new TestSleep0_Method2();
        TestSleep0_Method2 obj2 = new TestSleep0_Method2();
        obj1.start();
        obj2.start();
    }
}
