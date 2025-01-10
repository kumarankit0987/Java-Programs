package com.numbers;

public class PalindromeString {
    public static void main(String[] args) {
        String str = "sos";
        String originalString = str;
        String rev = "";
        for(int i = str.length()-1; i >=0; i--) {
            rev = rev + str.charAt(i);
        }
        //System.out.println(rev);
        if(originalString.equals(rev)){
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not Palindrome");
        }
    }

}
