package com.oops;

public class Animal {
    String name;
    String color;
    public void usingMyMethod(String n,String c) {
        name = n;
        color=c;
        System.out.println(name + " " + color);
    }
    //public void display(){
      //  System.out.println(name + " " + color);
    //}
    public static void main(String[] args) {
        // Create object of Animal class
        Animal dog = new Animal();
        // Initialization or put the value in object using instance variable
        dog.name = "Rambo";
        dog.color = "Black";
        System.out.println("using instance variable to initialization the value in Object ");
        System.out.println(dog.name);
        System.out.println(dog.color);
        // Using method to initialization the value in Object
        System.out.println(".....................");
        System.out.println("Using method to initialization the value in Object");
        dog.usingMyMethod("Rambo","Black");
    }
}
