package com.company;

import java.util.Scanner;

public class MultiplicationTableUsingFunctions {
    static void multiplication(int n) {
        for(int i =1; i<=10;i++) {
            System.out.println(n + "*" + i + "=" + n*i);
        }
    }
    public static void main(String[] args) {
        multiplication(5);
    }
}
