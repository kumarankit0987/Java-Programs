package com.company;

public class MethodParameterAndArguments {
    // create a method
    static void myMethod(String nme, int ag,long mobNo) { // nme is  parameters
        System.out.println("My name is " + nme + " my age is" + ag + "Mobile number is " + mobNo );
    }

    public static void main(String[] args) {
        myMethod("Ankit",23,9205533493l); //"Ankit",23,9205533493l is arguments
        // Always pass equal no of parameters and arguments and in same order.
     }
    }
