package com.practiceSet11;
// Create a class Telephone with ring(),lift(), and disconnect() method as abstract methods.
// Create another class SmartTelephone and demonstrate polymorphism.
abstract class Telephone {
    public abstract void ring();
    public abstract void lift();
}
class SmartTelephone extends Telephone {
    void camera() {
        System.out.println("Take snap");
    }
    String networks(String ...networks) {
        String network = " ";
        for(String element : networks) {
            System.out.print(element);
        }
        return network;
    }

    @Override
    public void ring() {
        System.out.println("Telephone is ringing");
    }
    public void lift() {
        System.out.println("lift");
    }
}
public class Question3 {
    public static void main(String[] args) {
        SmartTelephone obj = new SmartTelephone();
        obj.camera();
        obj.networks("Ram","Shyam","devil_xx5g");
        obj.lift();
        obj.ring();
    }
}
