package com.company;

import java.util.Scanner;

public class CHW_Ch5_Factorial {
    public static void main(String[] args) {
        // Wap to find factorial of given number using for loop
        int factorial = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc. nextInt();
        for(int i = n; i>0; i--) {
            // Logic
            // n = 5 - factorial = 3 * 2 * 1  = 120
            // factorial = 1
            // when enter the n=3; and first execute the loop i =3; because i = n.
            // and check the 3 != 0 condition is true
            // factorial = 1 * 3 =3
            // i = 2
            // factorial = 3
            // factorial = 3 * 2 = 6
            // i = 1
            // factorial = 6
            // factorial = 1 * 6 = 6
            // factorial of 3 is 6 (3 * 2 * 1 = 6)

            factorial = factorial * i ;
        }
        System.out.println("Factorial of " + n +" " + "is" + " " + factorial);
    }
}
