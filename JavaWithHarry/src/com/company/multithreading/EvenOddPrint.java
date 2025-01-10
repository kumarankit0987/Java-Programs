package com.company.multithreading;

public class EvenOddPrint {
    int n=10;

    public void printEvenNo() throws InterruptedException {
        synchronized (this){
            while (n>0){
                if(n%2==1){
                    wait();
                }
                System.out.println(Thread.currentThread().getName() + " "+ n);
                n--;
                notify();
            }

        }
    }

    public void printOdd() throws InterruptedException {
        synchronized (this){
            while (n>0){
                if(n%2==0){
                    wait();
                }
                System.out.println(Thread.currentThread().getName() + " "+ n);
                n--;
                notify();
            }

        }
    }

    public static void main(String[] args) {
        EvenOddPrint obj=new EvenOddPrint();
        Runnable even=()->{
            try {
                obj.printEvenNo();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };

        Runnable odd=()->{
            try {
                obj.printOdd();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };
        new Thread(even, "even").start();    
        new Thread(odd, "odd").start();

    }
}
