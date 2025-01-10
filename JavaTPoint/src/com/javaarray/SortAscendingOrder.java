package com.javaarray;

public class SortAscendingOrder {
    public static void main(String[] args) {
        SortAscendingOrder obj = new SortAscendingOrder();
        int[] arr = {7,19,13,32,1,3,6,54};
        int len = arr.length-1;
        int noOfLoopCount=0;
        obj.print(arr);
        System.out.println(" Count:" + noOfLoopCount);
        obj.print(obj.bubleSort(arr));
    }

    void print(int[] a) {
        for(int i=0;i<a.length;i++) {
            System.out.print(a[i] + " ");
        }
    }
    int[] bubleSort(int[] arr) {
        int len = arr.length;
        for(int i=0; i<len; i++){
            for(int j= len-1; j>i; j--){
                if(arr[i] > arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        return arr;
    }
}
