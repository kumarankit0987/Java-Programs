package com.numbers;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String str1 = "SILENT";
        String str2 = "LISTEN";

        char a[] = str1.toCharArray();
        char b[] = str2.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        boolean result = Arrays.equals(a,b);
        if(result == true) {
            System.out.println("Anagram");
        }
        else {
            System.out.println("Not Anagram");
        }
    }
}
