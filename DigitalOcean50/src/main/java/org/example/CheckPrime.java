package org.example;

public class CheckPrime {

    public static void isPrime(int number) {
        int count = 0;
        for(int i =1; i<=number; i++) {
            if(number % i == 0) {
                count = count + 1;
            }
        }
        if(count == 2) {
            System.out.println(number + " " + " is Prime number");
        }
        else {
            System.out.println(number + " " + " is  not a Prime number");
        }
    }

    public static void main(String[] args) {
        isPrime(31);
    }
}
