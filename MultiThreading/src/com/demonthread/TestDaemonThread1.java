package com.demonthread;

public class TestDaemonThread1 extends Thread{

    public void run() {
       if(Thread.currentThread().isDaemon()) {
           System.out.println("Demon thread is work");
       }
       else {
           System.out.println("User Thread is work");
       }
    }

    public static void main(String[] args) {
        TestDaemonThread1 t1=new TestDaemonThread1();//creating thread
        TestDaemonThread1 t2=new TestDaemonThread1();
        TestDaemonThread1 t3=new TestDaemonThread1();

        t1.setDaemon(true);//now t1 is daemon thread

        t1.start();//starting threads
        t2.start();
        t3.start();
    }
}
