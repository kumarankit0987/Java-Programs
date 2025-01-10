package com.company;

import java.util.Scanner;

public class IfElseLadder {
    public static void main(String[] args) {
        // Wap to check if age is greater than and equal to 55 then experienced and less than equal to 45 then semi-experienced
        //and less than equal to 35 then semi-semi experienced.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age");
        int age = sc.nextInt();
        if(age >= 55) {
            System.out.println("Experienced");
        }
        else if(age>=45) {
            System.out.println("semi-experienced");
        }
        else if(age>=35) {
            System.out.println("Semi-semi-experienced");
        }
      //  else {
       //     System.out.println("Fresher");
     //   }
    }
}
