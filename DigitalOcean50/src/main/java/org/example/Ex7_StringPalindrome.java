package org.example;

public class Ex7_StringPalindrome {
    public static void main(String[] args) {
        String str = "oyoy";
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        if(rev.equals(str)) {
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not Palindrome");
        }
    }
}
