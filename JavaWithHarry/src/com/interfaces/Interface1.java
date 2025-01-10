package com.interfaces;
interface MotorCycle {
    static final int speed = 0;
    String typeOfBike = " ";
    int speed(int speed);
    String typeOfBike(String typeOfBike);
}
class Bike implements MotorCycle {
    public int speed(int speed) {
        return speed;
    }

    @Override
    public String typeOfBike(String typeOfBike) {
        return typeOfBike;
    }

    public String typeofBike(String typeOfBike) {
        return typeOfBike;
    }
    void display() {
        System.out.println("Speed of Bike " + speed);
        System.out.println("Type od Bike " + typeOfBike);
    }
}
public interface Interface1 {
    public static void main(String[] args) {
        Bike b1 = new Bike();
        b1.typeOfBike("Super Bike");
        b1.speed(550);
        b1.display();
    }
}
