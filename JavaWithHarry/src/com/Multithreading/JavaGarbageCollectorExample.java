package com.Multithreading;

public class JavaGarbageCollectorExample {
    public void finalize() {
        System.out.println("Object is garbage collected");
    }
    public static void main(String[] args) {
        JavaGarbageCollectorExample s1 = new JavaGarbageCollectorExample();
        JavaGarbageCollectorExample s2 = new JavaGarbageCollectorExample();
        s1 = null;
        s2 = null;
        System.gc();
    }
}
