package org.example;

public class Ex3_StringContainsVowel {
    //  Write a Java program to check if a vowel is present in a string.
    public static void main(String[] args) {
        int vCount = 0;
        int cCount = 0;
        String str = "Ram is a good boy";
        str = str.replaceAll("\\s", "");

        System.out.println("Vowel Present in String :");
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                vCount = vCount + 1;

                System.out.print(str.charAt(i) + " ");
            }
            else {

                cCount = str.length() - vCount;
            }
        }
        System.out.println("\n");
        System.out.print("Total number of vowel :" + vCount);
        System.out.println("\n");
        System.out.println("Total number of Consonant:" + cCount);
    }
}

