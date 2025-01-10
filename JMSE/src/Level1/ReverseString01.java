package Level1;

import java.util.Scanner;

public class ReverseString01 {

    // Reverse String - keeping performance in mind (without StringBuffer) in java
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Input String");
        String str = sc.next();
        String revString = "";
        System.out.println("Original String" + " " + str);

        for(int i= str.length()-1; i>=0; i--){
            revString = revString + str.charAt(i);
        }
        System.out.println("Reverse String" + " " + revString);
    }
}
