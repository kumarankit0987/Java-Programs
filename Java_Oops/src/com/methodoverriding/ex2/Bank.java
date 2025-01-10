package com.methodoverriding.ex2;

public class Bank {
    int getRateOfInterest(){
        return 0;
    }
}
class SBI extends Bank{
    int getRateOfInterest(){
        return 8;
    }
}
class ICICI extends Bank{
    int getRateOfInterest(){
        return 7;
    }
}

class AXIS extends Bank{
    @Override
    int getRateOfInterest() {
        return 9;
    }
}
class Main {
    public static void main(String[] args) {
        SBI i = new SBI();
        System.out.println(i.getRateOfInterest());
    }
}
