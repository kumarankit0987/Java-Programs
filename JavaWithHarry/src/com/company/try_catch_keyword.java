package com.company;

public class try_catch_keyword {
    public static void main(String[] args) {
        int a = 10000;
        int b = 3;
       // System.out.println(c); // we know that if we divide any number in java by 0
        // it will throw an error Arithmetic exception

        // we will put the code in try statement to run the code
        try {
            int c = a/b;
            System.out.println("The result of c :" + c);
        }
        // Now we use catch statement to catch the exception if any exception occur then it will
        // catch the exception and print it.otherwise the result of c is printed in line no 13.
        catch(Exception e) {
            System.out.println("The exception occur :");
            System.out.println(e);
        }
    }
}
