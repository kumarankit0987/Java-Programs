package com.company;

public class Handling_Specific_Exception {
    public static void main(String[] args) {
        int arr [] = {1,2,3,4,5};
        int a =0;
        try {
            System.out.println("The result of divide the number :" + arr[10]);
            System.out.println("The element of array at index :" + arr[10]/a);
        }
        catch(ArithmeticException e ) {
            System.out.println("The exception occurs is ArithmeticException " + e);
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("The exception  occur is ArrayIndexOutOfBoundsException  " + e);
        }
        catch(Exception e) {
            System.out.println("Some other exception occur " + e);
        }
    }
}
