package com.methodoverriding.ex1;

public class Animal {
    void run(){
        System.out.println("Animal is running");
    }
}

class Cow extends Animal{
    void run(){
        System.out.println("Cow is running");
    }

    public static void main(String[] args) {
        Cow c1 = new Cow();
        c1.run();
    }
}
