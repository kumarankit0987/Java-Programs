package com.basicInterviewQuestions;

import java.util.Arrays;

public class Anagrams {
    public static void main(String[] args) {
        String str = "He Is silent";
        String str1 = "Is He listen";
        //Change the string into char array
       char[] arr = str.toCharArray();
       char[] arr1 = str1.toCharArray();
       // sort the array
        Arrays.sort(arr);
        Arrays.sort(arr1);
        Boolean result = Arrays.equals(arr,arr1);
        if(result==true) {
            System.out.println("Anagrams");
        }
        else {
            System.out.println("Not Anagrams");
        }
    }
}
