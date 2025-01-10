package com.StaticInterviewQuestions;

public class StaticExample1 {
    int a = 10;
    static int b = 20;

    public static void main(String[] args) {
        StaticExample1 obj1 = new StaticExample1();
        obj1.a = 100;
        obj1.b = 200;
        System.out.println(" print a = "+ obj1.a + " " + "for object1");//100
        System.out.println(" print b = " + obj1.b +" " + "for object1");//200

        StaticExample1 obj2 = new StaticExample1();
        System.out.println(" print a = "+ obj2.a + " " + "for object2");//10
        System.out.println(" print a = "+ obj2.b + " " + "for object2s");//200
    }
}
