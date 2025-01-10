package com.oops.Inheritance;

public class Animal {

    void eat() {
        System.out.println("Animal is eat ");
    }

    void run() {
        System.out.println("Animal  is run fast");
    }
}
    class Dog extends Animal {
        void bark() {
            System.out.println("Dog is bark");
        }
        void jump() {
            System.out.println("My dog is jumping");
        }

    public static void main(String[] args) {
       // Create object of dog class
        Dog myDog = new Dog();
        myDog.eat(); //
        myDog.bark();
        // Create an Object of Animal
        Animal obj = new Animal();
        obj.eat();
        obj.run();
    }
}
