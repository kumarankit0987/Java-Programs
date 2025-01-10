package com.string;

import java.util.Arrays;

public class Anagram {

    public static void check_Anagram(String str1, String str2){

        // convert String to array
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        // sort the array
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // check the content of array
        boolean result = Arrays.equals(arr1,arr2);
        if(result){
            System.out.println(str1 + " and " + str2 + " " + "anagram");
        }
        else {
            System.out.println(str1 + " and " + str2 + " " + " not anagram");
        }
    }

    public static void main(String[] args) {
        String str1 = "Race";
        String str2 = "Care";

        check_Anagram(str1,str2);
    }
}
