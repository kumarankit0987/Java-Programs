package Level1;

import java.util.Scanner;

public class SwapTwoNumbersWithoutUsingThirdVariable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first input number");
        int num1= sc.nextInt();
        System.out.println("Enter the second input number");
        int num2= sc.nextInt();
        swapTwoNumber(num1,num2);
    }
    public static void swapTwoNumber(int num1, int num2){
        System.out.println("Original Number1" + " " + num1);
        System.out.println("Original Number2" + " " + num2);
        num2 = num2 - num1;
        num1 = num2 + num2;
//        num1 = num1 + num2;//30
//        num2 = num1 - num2;//10
//        num1 = num1 - num2;//20
        System.out.println("After Swapping Number1" +" " + num1);
        System.out.println("After Swapping Number2"+" " +num2);
    }
}
