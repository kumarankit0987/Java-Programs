package com.company;

public class UsingSubStringMethod {
    public static void main(String[] args) {
        String str = "Ankit";
        for(int i =0; i<=str.length()-1; i++) {
            for(int j =i+1; j<=str.length()-1; j++) {
                System.out.print(i);
                System.out.println(j);
            }
        }
    }
}
