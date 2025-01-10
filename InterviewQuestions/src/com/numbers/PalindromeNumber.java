package com.numbers;

public class PalindromeNumber {
    public static void main(String[] args) {
        int no = 121;
        int originalNo=no;
        int rev = 0;
        int rem;
        while(no !=0) {
            rem = no % 10;
            rev = rev *10 + rem;
            no = no/ 10;

        }
       if(originalNo == rev){
           System.out.println("Palindrome");
       }
       else {
           System.out.println("Not Palindrome");
       }
    }
}
