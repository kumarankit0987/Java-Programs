package com.company;

class NegativeRadiusException extends Exception {
    @Override
    public String toString() {
        return "Radius cannot be negative!";
    }

    @Override
    public String getMessage() {
        return "Radius cannot be negative";
    }
}
public class Exception_Class {
    public static double area(int r) throws NegativeRadiusException { // throws keyword
        // is used to declare to inform to the programmer that there might be an exception
        if (r < 0) {
            throw new NegativeRadiusException(); // throw keyword is used
            // to throw exception by programmer.
        }
        double result = Math.PI * r * r;
        return result;
    }

    public static void main(String[] args) {
        try {
            double arr = area(-1);
            System.out.println(arr);
        }
        catch(Exception e) {
            System.out.println("This gives an error" + e);
        }
    }
}