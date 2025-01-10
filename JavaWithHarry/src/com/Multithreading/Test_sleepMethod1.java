package com.Multithreading;

class Test_sleepMethod2 extends Thread {
    public  void run(){
        for(int i=1;i<5;i++) {
            // the thread will sleep for the 500 milliseconds
            try {
                Thread.sleep(500);
            }
            catch(InterruptedException e){
                System.out.println(e);}

                System.out.println(Thread.currentThread().getName()+" "+  i);
            }
        }
    }
public class Test_sleepMethod1 {
    public static void main(String[] args) {
        Test_sleepMethod2 t1=new Test_sleepMethod2();
        Test_sleepMethod2 t2=new Test_sleepMethod2();
        t1.start();
        t2.start();
    }
}
