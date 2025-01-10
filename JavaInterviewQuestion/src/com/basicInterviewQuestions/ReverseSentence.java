package com.basicInterviewQuestions;

import java.util.List;

public class ReverseSentence {
    public static void main(String[] args) {
        String str = "Ram is a good boy";
        for(int i = str.length()-1; i>=0; i--) {
            System.out.print(str.charAt(i));
        }
    }
}
