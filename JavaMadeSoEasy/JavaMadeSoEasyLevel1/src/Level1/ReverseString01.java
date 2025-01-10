package Level1;

import java.util.Scanner;

public class ReverseString01 {
    public static void main(String[] args) {
        String reverse = "";
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String Input");
        String str = sc.next();
        System.out.println("Original String:"+ " " + str);
        reverseString(str,reverse);
   }
   public static void reverseString(String str, String reverse){
       System.out.print("Reverse String:" + " ");
        for(int i=str.length()-1; i>=0; i--){
            reverse = reverse + str.charAt(i);
        }
       System.out.print(reverse);
   }
}
