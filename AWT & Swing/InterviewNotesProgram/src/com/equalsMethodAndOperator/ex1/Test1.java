package com.equalsMethodAndOperator.ex1;

public class Test1 {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hello");

        System.out.println(s1 == s3);
        System.out.println(s1.equals(s3));
    }
}
