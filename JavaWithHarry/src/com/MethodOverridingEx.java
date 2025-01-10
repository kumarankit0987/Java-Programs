package com;
class Animal {
    public void eat() {
        System.out.println("Animal is eat food");
    }
}
class Dog extends Animal {
    public void eat() {
        System.out.println("Dog is eat meat");
    }
}
public class MethodOverridingEx {
    public static void main(String[] args) {
        Dog a1 = new Dog();
        a1.eat();
    }
}
