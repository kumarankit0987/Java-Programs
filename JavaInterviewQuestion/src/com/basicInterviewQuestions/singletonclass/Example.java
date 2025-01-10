package com.basicInterviewQuestions.singletonclass;

public class Example {
    //First declare all the constructor is private
    private Example() {
        System.out.println("I am private constructor");
    }

    private static Example obj = new Example();

    public static Example getInstance() {

        return obj;
    }
}
