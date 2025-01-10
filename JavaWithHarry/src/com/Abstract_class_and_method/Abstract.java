package com.Abstract_class_and_method;

abstract class Phone {
    abstract void ring();
    abstract void pickCall();
    abstract void declineCall();
}
class SmartPhone extends Phone {
    @Override
    void ring() {
        System.out.println("Phone is ringing");
    }
    @Override
    void pickCall() {
        System.out.println("Pick my call");
    }
    @Override
    void declineCall() {
        System.out.println("Decline the call");
    }
     void camera() {
        System.out.println("Take my picture");
    }
    void wifi() {
        System.out.println("Connect to wifi");
    }
}
public class Abstract {
    public static void main(String[] args) {
        SmartPhone myPhone = new SmartPhone();
        myPhone.ring();
        myPhone.pickCall();
        myPhone.declineCall();
        myPhone.camera();
        myPhone.wifi();
    }
}
