package com.string;

public class CountCharacter {
    public static void countCharacter(String str){
        int count=0;
        str = str.replaceAll("\\s", "");
        for(int i=0; i<str.length(); i++){
            count = count +1;
        }
        System.out.println("Total number of Character in given String :" + count);
    }

    public static void main(String[] args) {
        countCharacter("Ankit Kumar is a good boy");
    }
}
