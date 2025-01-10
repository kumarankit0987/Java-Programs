package com.ConstructorChaining;

public class Ex3 {
    Ex3(){
        this(5);
        System.out.println("Its a default constructor");
    }
    Ex3(int x){
        this(25,10);
        System.out.println(x * 5);
    }

    Ex3(int x, int y){
        System.out.println(x + y);
    }

    public static void main(String[] args) {
        new Ex3();
    }
}
