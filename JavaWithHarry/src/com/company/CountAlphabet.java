package com.company;
//import static java.lang.StringUTF16.charAt;

import java.util.HashMap;
import java.util.Map;

public class CountAlphabet {
    public static void main(String[] args) {
        Map<Character,Integer> map=new HashMap<>();
        String str="HeyIamAnkit";
        for (int i = 0; i <str.length() ; i++) {
            if(map.containsKey(str.charAt(i))){
                map.put(str.charAt(i),map.get(str.charAt(i))+1);
            }else {
                map.put(str.charAt(i),1);
            }
        }
        System.out.println(map);




    }
}
