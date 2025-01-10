package com.practiceSet11;
class Monkey {
    void jump() {
        System.out.println("Monkey can jump ");
    }
    void bite() {
        System.out.println("Monkey is bite");
    }
}
interface BasicAnimal {
    public void eat();
    public void sleep();
}
class Human extends Monkey implements BasicAnimal {
    public void eat() {
        System.out.println("Animal is eat");
    }
    public void sleep() {
        System.out.println("Animal is sleep");
    }
}
public class Question2 {
    public static void main(String[] args) {
        Monkey obj = new Human();
        obj.bite();
        obj.jump();
    }
}
