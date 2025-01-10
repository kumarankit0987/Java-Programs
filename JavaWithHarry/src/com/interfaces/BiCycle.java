package com.interfaces;

public interface BiCycle {
    void applyBreak(int decrement);
    void increaseSpeed(int increment);
}
interface HornBicycle {
    void bell();
    void electricHorn();
}
class AvonCycle implements BiCycle {
    int speed = 10;
    public void applyBreak(int decrement) {
         speed = speed - decrement;
        System.out.println("Decrease the speed :" + speed);
    }
    public void increaseSpeed(int increment) {
         speed = speed + increment;
        System.out.println("Increase the speed :" + speed);
    }
    public void bell() {
        System.out.println("trn-trn or tun-tun");
    }
    public void electricHorn() {
        System.out.println("tururururu-turururu");
    }
    public static void main(String[] args) {
        AvonCycle myCycle = new AvonCycle();
        myCycle.applyBreak(5);
        myCycle.increaseSpeed(4);
        myCycle.bell();
        myCycle.electricHorn();
    }
}
