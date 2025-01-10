package com.company.multithreading;
class Even extends Thread {
    public void run() {
            System.out.println("Even No");
            for(int i =0; i<100; i++) {
                if(i % 2 ==0)
                    System.out.println(getName()+" "+i);
            }
        }
    }
class Odd extends Thread {
        public void run() {
            System.out.println("odd No");
            for(int i =1; i<100; i++) {
                if(i % 2 != 0)
                System.out.println(getName()+" "+i);
            }
        }
    }

public class Even_Odd_Program {
    public static void main(String[] args) {
        Even e = new Even();
        Odd o = new Odd();
        e.start();
        o.start();
    }
}
