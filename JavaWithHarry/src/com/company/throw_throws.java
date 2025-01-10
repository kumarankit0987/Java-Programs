package com.company;

public class throw_throws {
    // This divide function is made by Ankit
    public static int divide(int a, int b) throws ArithmeticException {
        int result = a/b;
        return result;
    }

    public static void main(String[] args) {
        //This function is used by Other person
        try {
            int c = divide(6, 0);
            System.out.println(c);
        } catch (Exception e) {
            System.out.println("This will throw an error" + " " + e);
        }
    }
}
