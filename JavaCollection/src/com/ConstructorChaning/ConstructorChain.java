package com.ConstructorChaning;

public class ConstructorChain {
    ConstructorChain() {
        this(12,"Ankit");
        System.out.println("This is default constructor");
    }
    ConstructorChain(int a) {
        this();
        System.out.println("I am one Arg constructor");
    }
    ConstructorChain(int x,String y){
        System.out.println("I am two args constructor");
    }

    public static void main(String[] args) {
      //  ConstructorChain c1 = new  ConstructorChain();
        ConstructorChain c2 = new ConstructorChain(12);
    }
}
