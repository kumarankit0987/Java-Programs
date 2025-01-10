package com.company;


class Parent{
    void lightOn(){
        System.out.println("done");
    }
    void print(int a){
        System.out.println("Interest rate %" +  a*a);
    }
    final void customMethod(){
        System.out.println("Parent Custom");
    }
}
class Child extends Parent {
    void print(int a) {
        System.out.println("Interest rate %" + a * a * a);

    }

    public class OverrideExample {
        public static void main(String[] args) {
            Parent parent = new Child();
            parent.print(10);
            parent.lightOn();
        }
    }
}
