package com.polymorphism;
public class MotorBike {
   int speedLimit = 90;
}
class Pulsar extends MotorBike {
    int speedLimit = 200;
    public static void main(String[] args) {
        MotorBike obj = new Pulsar();
        System.out.println(obj.speedLimit);
    }
}
