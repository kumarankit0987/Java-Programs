package com.string;

public class CountVowelConsonant {

    public static void countVowel(String str){
        String str1 = "aeiouAEIOU";
        int count=0;
        for(int i=0; i<str.length(); i++){
            for(int j=0; j<str1.length(); j++){
                if(str.charAt(i) == str1.charAt(j)){
                    count++;
                    break;
                }
            }
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        String str = "AnkitKumar";
        countVowel(str);
    }
}
