package com.w3resource_OOPs;

public class Example02 {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Rambo","German");
        Dog dog2 = new Dog("Charlie","PitBull");

        System.out.println(dog1.getName() + " " + dog1.getBreed());
        System.out.println(dog2.getName() + " " + dog2.getBreed());

        dog1.setName("Ragnar");
        dog2.setBreed("Bulldog");

        System.out.println(dog1.getName() + " " + dog1.getBreed());
        System.out.println(dog2.getName() + " " + dog2.getBreed());
    }
}
class Dog {
    private String name;
    private String breed;

    Dog(String name, String breed){
        this.name=name;
        this.breed=breed;
    }
    void setName(String name){
        this.name=name;
    }
    void setBreed(String breed){
        this.breed=breed;
    }
    String getName(){
        return name;
    }
    String getBreed(){
        return breed;
    }
}
