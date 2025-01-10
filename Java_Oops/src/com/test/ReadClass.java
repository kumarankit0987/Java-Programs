package com.test;

class Animal {
    private String color;


    String setColor(String color){
        this.color = color;
    }
}
public class ReadClass {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.setColor("Brown");
    }
}
