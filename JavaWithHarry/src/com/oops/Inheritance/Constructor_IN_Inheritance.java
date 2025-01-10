package com.oops.Inheritance;
class Base {
    Base() {
        System.out.println("I am a Constructor");
    }
    // Overloaded constructor of Base class
    Base(int x) {
        System.out.println("I am an overloaded constructor with value of a as: " + x);
    }
}
class Derived extends Base {
    Derived() {
       // super(0); // jo value pass krenge super ke andar utna print krega mera argument wala constructor
        // jab hume base class ke argument wale constructor execute karna hai to hum
        //super() keyword ka use karate hai
        System.out.println("I am a derived Class constructor");
    }
    // Overloaded Constructor of Derived class
    Derived(int x, int y) {
      super(1);
        System.out.println("I am an overloaded constructor of derived with value of a as: " + y);
    }
}
class childOfDerived extends Derived {
    childOfDerived(int x, int y, int z) {
        super(x,y);
        System.out.println("I am an overloaded constructor of derived with value of a as: " + z);
    }
}
public class Constructor_IN_Inheritance {
    public static void main(String[] args) {
        // Base obj = new Base();
      // Derived obj1 = new Derived(2,9);
        childOfDerived obj3 = new childOfDerived(1,2,3);
    }
}

