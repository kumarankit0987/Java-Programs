package com.company;

public class CHW_Ch6_SearchNumberINArray {
    public static void main(String[] args) {
        //WAP to find weather a given Integer is present in an array or not.
        int arr[] = {9, 8, 7, 6, 5, 4};
        int n = 9;
        boolean isArray = false; // default value of boolean is false
        for (int element : arr) {
            if (element == n) {
                isArray = true;
                break;
            }
        }
            if(isArray) {
                System.out.println("true");
            }
            else {
                System.out.println("False");
            }
            }
        }
