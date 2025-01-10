package com.pattern;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number  n :");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
           for(int j=n; j>=i; j--){
               System.out.print("* ");
           }
            System.out.println();
           for(int k= 1; k<=i; k++){
               System.out.print(" ");
           }
        }

        for(int i =2; i<=n; i++){
            for(int j=n-1; j>=i; j-- ){
                System.out.print(" ");
            }
            for(int k=1; k<=i; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
