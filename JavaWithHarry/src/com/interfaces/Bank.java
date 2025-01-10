package com.interfaces;

public interface Bank {
    float rateOfInterest();
}
class SBI implements Bank {
    public float rateOfInterest() {
        return 9.5f;
    }
}
class PNB implements Bank {
    public float rateOfInterest() {
        return 5.4f;
    }
}
class Print {
    public static void main(String[] args) {
        Bank obj;
        obj = new PNB();
        System.out.println(obj.rateOfInterest());
        obj = new SBI();
        System.out.println(obj.rateOfInterest());
    }
}
