package com.Multithreading;

class MyClass extends  Thread {
    public void run() {
    }
}
public class JoinMethod {
    public static void main(String[] args) {
        MyClass th1 = new MyClass();
        MyClass th2 = new MyClass();
        MyClass th3 = new MyClass();
        th1.start();
        th2.start();;
    }
}
