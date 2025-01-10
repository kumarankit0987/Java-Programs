package com.Map.HashCodeEquals;

public class Example1 {
    public static void main(String[] args) {
        Laptop lap1 = new Laptop();
        lap1.model="DELL l1";
        lap1.price=40000;

        System.out.println(lap1);

    }
}
class Laptop{
     String model;
     int price;

    @Override
    public String toString() {
        return "Laptop{" +
                "model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}
