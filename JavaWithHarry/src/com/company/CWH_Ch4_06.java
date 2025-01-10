package com.company;

import java.util.Scanner;

public class CWH_Ch4_06 {
    public static void main(String[] args) {
        //WAp to find out the type of website from url
        //1)-.com - commercial website 2)-.url organization website 3)- .in Indian Website
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Website");
        String website = sc.nextLine();
        if (website.endsWith(".com")) {
            System.out.println("Commercial website");
        }
        else if(website.endsWith(".url")) {
            System.out.println("Organization website");
        }
        else if(website.endsWith(".in")){
            System.out.println("Indian website");
        }
    }
}
