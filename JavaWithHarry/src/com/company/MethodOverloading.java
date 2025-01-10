package com.company;

public class MethodOverloading {
    static int sum(int x,int y) {
        int sum = x + y;
        return sum;
    }
    static int sum(int x) {
        return x + 8;
    }

    public static void main(String[] args) {
        System.out.println(sum(12));
    }
}
