package com.company;

public class SuperKeywordUses {
    int a = 10;
}
class Abc extends SuperKeywordUses {
    int a = 20;
    void method(int a) {
        // if we put the instance variable local variable with same name
        // And use of super keyword then compiler not confuse
        // As like
        System.out.println(super.a); // this will print parent class instance variable
        System.out.println(this.a); // this will print current class instance variable
        System.out.println(a); // this will print local variable
    }

    public static void main(String[] args) {
        Abc obj = new Abc();
        obj.method(30);
    }
}
