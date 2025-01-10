package com.polymorphism;

class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}
class Dog extends Animal {
    void eat() {
        System.out.println("Dog eat meat");
    }
}
class BabyDog extends Dog {
    void eat() {
        System.out.println("drinking milk");
    }
}
public class Polymorphism_By_MultilevelInheritance {
    public static void main(String[] args) {
        Animal a;
        a = new Animal();
        a.eat();
        a = new Dog();
        a.eat();
        a = new BabyDog();
        a.eat();
    }
}
