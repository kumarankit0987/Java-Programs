package com.javaarray;

import java.util.HashMap;

public class FrequencyElementArray {
    public static void main(String[] args) {
        int[] arr1 = {1,3,2,1,4,2,1,6,7,3,4,9,8,4};
        int[] arr2 = arr1;
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;

        for(int i=0; i<arr1.length; i++){
            for(int j=0; j<arr2.length; j++){
                if(arr1[i] == arr2[j]){
                    count++;

                }
                map.put(arr1[i],count);
            }
        }
        System.out.println(map);
    }
}
