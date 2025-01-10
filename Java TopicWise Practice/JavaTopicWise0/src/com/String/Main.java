package com.String;

public class Main {
    public static void main(String[] args) {
        String s1 = new String("Ram");
        String s2 = "Ram";

        // == Operator check the reference and address
        System.out.println(s1==s2);//false

        // equals() method check the content of objects
        System.out.println(s1.equals(s2));//true

    }
}
