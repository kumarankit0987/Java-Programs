package com.basicInterviewQuestions;

public class PalindromeString {
            public static void main(String[] args) {
                String str = "radar";
                String rev = "";
                for (int i = str.length() - 1; i >= 0; i--) {
                    rev = rev + str.charAt(i);
                }

                if(str.equals(rev)) {
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not Palindrome");
        }


        boolean palindromeFlag=true;
        for (int i = 0; i <=str.length()/2 ; i++) {
            if(str.charAt(i)!=str.charAt(str.length()-1-i)){
                palindromeFlag=false;
                break;
            }
        }
        if(palindromeFlag==true){
            System.out.println("Palidrone");
        }else {
            System.out.println("Not palindrone");
        }
    }
}
