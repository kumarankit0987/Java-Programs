package Level1;

import java.util.Scanner;

public class SumOfDigit06 {
    public static void sumOfDigits(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        int sum=0;
        while(num > 0){
            int rem = num % 10;
            sum = sum + rem;
            num = num/10;
        }
        System.out.println("Sum of digits:" + sum);
    }

    public static void main(String[] args) {
        sumOfDigits();
    }
}
