package Level1;

import java.util.Scanner;

public class ReverseNumber03 {
    public static void main(String[] args) {
        //Take scanner method to take input from the user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input");
        int num = sc.nextInt();
        int rev_num=0;
        System.out.println("Original Number:" + " " + num);
        //Reverse the number using for loop
        for(;num>0; num=num/10){
            int rem = num%10;
            rev_num = rev_num * 10 + rem;
        }
        System.out.println("Reverse Number:" + " " + rev_num);
    }
}
