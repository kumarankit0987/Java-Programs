package org.example;

public class Ex8_RemoveSpaceString {
    public static void main(String[] args) {
        String str = " I am a Strong men ";
        String str2 = str.replaceAll("\\s","");

        System.out.println(str2);
    }
}
