package com.company;

public class CHW_Ch5_ReverseOrderMultiplicationTable {
    public static void main(String[] args) {
        // WAP to print multiplication table of 10 in reverse order
        int n = 10;
        for(int i = 10; i > 0; i--) {
            System.out.println(n + "*" + i + "=" + n * i);
        }
    }
}
