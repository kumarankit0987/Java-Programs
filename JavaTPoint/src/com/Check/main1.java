package com.Check;

public class main1 {
    public static void main(String[] args) {
        String str = "abc";
        for(int i=0; i<str.length(); i++){
           for(int j=i; j<=str.length(); j++){
               System.out.print(str.substring(i,j) + " ");
           }
        }
    }
}
