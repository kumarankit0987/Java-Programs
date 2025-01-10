package com.oops.Inheritance;

class Bird {
    void fly() {
        System.out.println("Bird is flying");
    }
}
class Cock extends Bird {
    void eat() {
        System.out.println("Bird is eating");
    }
}
class BabyCock extends Cock {
    void eat() {
        System.out.println("drinking milk");
    }
}
public class Multilevel_Inheritance {
    public static void main(String[] args) {
        BabyCock b = new BabyCock();
        b.eat();
        b.fly();
        b.eat();
    }
}
