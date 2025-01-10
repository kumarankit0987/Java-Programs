package com.interfaces;

public interface Animal {
    void eat();
    void run();
}
class Dog implements Animal {
    void bark() {
        System.out.println("Dog is bark");
    }
    public void eat() {
        System.out.println("Eating");
    }
    public void run() {
        System.out.println("Run");
    }

    public static void main(String[] args) {
        Dog d;
        d = new Dog();
        d.bark();
        d.eat();
        d.run();
    }
}
