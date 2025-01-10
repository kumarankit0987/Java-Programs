package com.company;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        // WAP to take button and if you press 1 then fan is start,press 2 light is on, press 3 tv is on
        // press 4 AC is on.
        Scanner sc = new Scanner(System.in);
        System.out.println("Press the Button");
        int button = sc.nextInt();
        switch (button) {
            case 1 :
                System.out.println("Fan is started");
                break;
            case 2:
                System.out.println("Light is on");
                break;
            case 3 :
                System.out.println("Tv is on");
                break;
            case 4 :
                System.out.println("Ac is On");
                break;
            default :
                System.out.println("You press Invalid Button");
        }
    }
}
