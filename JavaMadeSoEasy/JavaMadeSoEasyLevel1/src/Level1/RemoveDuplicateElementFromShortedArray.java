package Level1;

import java.util.Arrays;

public class RemoveDuplicateElementFromShortedArray {
    public static void main(String[] args) {
        //Given a Sorted Array
        int[] arr = {2,2,3,4,5,6,6,7,8,8,9};
        //Take an empty array of same length of sorted array
        //int[] temp = new int[arr.length];

        //Call method to removeDuplicateElements
        removeDuplicateElements(arr);
    }
    public static void removeDuplicateElements(int[] arr){
        int j=0;
        for(int i=0; i<arr.length-1; i++){
            if(arr[i] != arr[i+1]){
                arr[j]=arr[i];
                j++;
            }
        }
        arr[j] =arr[arr.length-1];
        for (int i=0; i<j+1; i++) {
             System.out.print(arr[i] + " ");
        }
    }
}
