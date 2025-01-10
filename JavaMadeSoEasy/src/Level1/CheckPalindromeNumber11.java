package Level1;

import java.util.Scanner;

public class CheckPalindromeNumber11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Input Number");
        int num = sc.nextInt();
        int reverse=0;
        int temp=num;
        checkPalindrome(num,reverse,temp);
    }
    public static void checkPalindrome(int num,int reverse,int temp){
        while (num !=0){
            int rem = num %10;
            reverse = reverse *10 + rem;
            num = num/10;
        }
       if(temp==reverse){
           System.out.println("Palindrome number");
       }
       else{
           System.out.println("Not a palindrome number");
       }
    }
}
