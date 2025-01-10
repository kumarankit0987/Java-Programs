package com.company;

public class MethodReferenceVariableExample {
    static int sum(int x, int y) {
        int z;
        if(x > y) {
             z = x + y;
        }
        else {
            z = (x + y) *5;
        }
        return z;
    }

    public static void main(String[] args) {
        int a = 2;
        int b = 10;
        int c = sum(a,b);
        System.out.println(c);
    }
}
