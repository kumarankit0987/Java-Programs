package com.numbers;

import java.util.HashMap;
import java.util.Map;

public class Frequency {
    public static void main(String[] args) {
        Map<Character,Integer> characterIntegerMap=new HashMap<>();
        String st="AnkitKumar";
        st=st.toLowerCase();
        for (int i = 0; i <st.length() ; i++) {
            if(characterIntegerMap.keySet().contains(st.charAt(i))){
                characterIntegerMap.put(st.charAt(i),characterIntegerMap.get(st.charAt(i))+1);
            }else {
                characterIntegerMap.put(st.charAt(i),1);
            }
        }
        System.out.println(characterIntegerMap);
    }
}
