package com.basicInterviewQuestions;

public class VowelConsonant {
    public static void main(String[] args) {
        String str = "ankitkumar";
        int cCount=0;
        int vCount=0;
        for(int i =0; i<=str.length()-1;i++) {
            if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){
               vCount++;

            }
            else {
                cCount = str.length()-vCount;
            }
        }
        System.out.println("Number of vowel : " + vCount);
        System.out.println("Number of Consonant : " + cCount);
    }
}
