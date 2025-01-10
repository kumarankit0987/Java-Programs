package com.company;

import java.util.Scanner;

public class CWH_Ch4_02 {


    public static float  calPercentage(float mark,float totalMark){
        return (mark/totalMark)*100;
    }
    public static boolean isPass(float phyMark,float chemMark,float mathMark){
        float overallPercentage=calPercentage(phyMark+chemMark+mathMark,300);
        if(overallPercentage>40 && (phyMark>33 && mathMark>33 && chemMark>33))
            return true;
        return false;
    }

    public static void main(String[] args) {
        int totalMarks = 300;
        Scanner sc = new Scanner(System.in);
        System.out.println("Marks of physics");
        float sub1 = sc.nextInt();
        System.out.println("Marks of Chemistry");
        float sub2 = sc.nextInt();
        System.out.println("Marks of Math");
        float sub3 = sc.nextInt();
        float avr = (sub1 + sub2 + sub3)/3.0f;
        System.out.println(avr);
        if(avr>=40 && sub1 >33 && sub2 >33 && sub3 > 33) {
            System.out.println("You are Passed");
        }
        else {
            System.out.println("You are failed");
        }
        System.out.println(isPass(sub1,sub2,sub3));
    }
}
