package com.javabasic;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        int number;
        int rev=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        number = sc.nextInt();
        int temp = number;
       while(number !=0){
           rev = (rev*10) + number % 10;
           number = number /10;
       }
       if(temp==rev){
           System.out.println("Prime Number");
       }
       else {
           System.out.println("Not Prime");
       }
    }
}
