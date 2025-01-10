package com.numbers;

public class PrimeNumber {
    public static String is_Prime(int n) {
        for(int i =2; i<=n; i++) {
            if(n % 2 == 0){
                return "Not Prime";
            }
        }
        return "Prime";
    }

    public static void main(String[] args) {
        System.out.println(is_Prime(5));
    }
}
