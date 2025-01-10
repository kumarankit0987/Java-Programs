package com.Multithreading;

public class TestDeadlockExample {
    public static void main(String[] args) {
        final String resource1 = "printer";
        final String resource2 = "scanner";

        Runnable  run1 = () -> {
            synchronized (resource1) {
                System.out.println(Thread.currentThread().getName() + ": locked" + resource1);
                try {
                    Thread.sleep(100);
                } catch (Exception e) {
                }
                synchronized (resource2) {
                    System.out.println(Thread.currentThread().getName() + ": locked" + resource2);
                }
            }
        };

        Runnable  run2 = () -> {
            synchronized (resource2) {
                System.out.println(Thread.currentThread().getName() + ": locked" + resource2);
                try {
                    Thread.sleep(100);
                } catch (Exception e) {
            }
            synchronized (resource1) {
                System.out.println(Thread.currentThread().getName() + ": locked" + resource1);
            }
        }
        };
            Thread thread1 = new Thread();thread1.setName("Desktop");
            Thread thread2 = new Thread();thread2.setName("Laptop");

            thread1.start();
            thread2.start();
    }
}
