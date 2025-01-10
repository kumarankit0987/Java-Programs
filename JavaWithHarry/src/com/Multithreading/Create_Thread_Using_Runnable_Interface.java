package com.Multithreading;

class A1 implements Runnable {
    public void run() {
        int i = 1;
        while (i <= 5) {
            System.out.println("I am thread create by using runnable interface" + i);
            i++;
        }
    }
}
    public class Create_Thread_Using_Runnable_Interface {
        public static void main(String[] args) {

            int i = 1;
            while (i <= 5) {
                A1 obj = new A1();
                Thread t1 = new Thread(obj);
                //If you are not extending the Thread class, your class object would not be treated as a thread object.
                // So you need to explicitly create the Thread class object.
                // We are passing the object of your class that implements Runnable so that your class run() method may execute.
                System.out.println("I am thread create by using runnable interface");
                i++;
                t1.start();
            }
        }
    }
