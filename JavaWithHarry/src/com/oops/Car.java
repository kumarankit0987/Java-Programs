package com.oops;

public class Car {
    String brand;
    String model;
    String engine;
    Car(String brn,String mdl,String eng) {
        brand =brn;
        model = mdl;
        engine = eng;
    }
    void print() {
        System.out.println(brand + " " + model + " " + engine);
    }

    public static void main(String[] args) {
        // we can see value initialize in the object
        Car c = new Car("Volvo","2018","Petrol engine");
        // print the value of object using name of object with (.) operator
        //System.out.println(c.brand + " " +  c.model + " " + c.engine);
        // print the value of object using print method
        c.print();
    }
}
