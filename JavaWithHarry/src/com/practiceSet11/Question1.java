package com.practiceSet11;
// Create an Abstract class pen with methods write() ad refill() as abstract methods.
abstract class Pen {
    public abstract void write();
    public abstract void refill();
}
class FountainPen extends Pen {
    public void changeNib(){
        System.out.println("Change nib");
    }
    public  void write() {
        System.out.println("I am writing");
    }
    public void refill() {
        System.out.println("Change the refill");
    }
}
public class Question1 {
    public static void main(String[] args) {

    }
}
