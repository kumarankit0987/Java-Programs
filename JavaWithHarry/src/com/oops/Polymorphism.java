package com.oops;
interface MyCamera {
    void takeSnap();
    void recordVideo();
}
interface MyWifi {
    String [] getNetworks();
    void connectToNetwork(String network);
}
class CellPhone {
    void callNumber(int phoneNumber) {
        System.out.println("Calling.." + phoneNumber);
    }
    void pickCall(int phoneNumber) {
        System.out.println("connecting..." + phoneNumber);
    }
}
class SmartPhone extends CellPhone implements MyCamera,MyWifi {
    public void takeSnap() {
        System.out.println("taking snap");
    }

    public void recordVideo() {
        System.out.println("Record video");
    }

    @Override
    public String[] getNetworks() {
        String[] networks = {"Harry", "Ankit", "devil_5g"};
        return networks;
    }

    @Override
    public void connectToNetwork(String network) {
        System.out.println("Connecting to network" + network);
    }
}
    public class Polymorphism {
        public static void main(String[] args) {
            MyCamera cam1 = new SmartPhone();
            cam1.recordVideo();
            cam1.takeSnap();
        }
    }
