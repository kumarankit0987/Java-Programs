package com.company;

public class CWH_Ch5_02 {
    public static void main(String[] args) {
        // First we take first even number
        int i = 2;
        // Taken n number up to take
        int n =20;
        // Take sum variable sum = 0;
        int sum =0;
        // loop execute i to n
        while(i<=n) {
            // check i is even number
            if(i % 2 ==0)
                // then sum of i
                sum = sum + i;
            i++;
            }
        System.out.println(sum);
        }
    }
