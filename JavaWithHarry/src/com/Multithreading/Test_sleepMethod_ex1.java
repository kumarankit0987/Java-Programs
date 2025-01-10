package com.Multithreading;


public class Test_sleepMethod_ex1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println("sleep method" + i);
        }
    }
}
