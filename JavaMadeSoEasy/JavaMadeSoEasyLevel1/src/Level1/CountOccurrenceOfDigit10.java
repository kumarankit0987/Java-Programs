package Level1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CountOccurrenceOfDigit10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter the Input Number");
            Long num=sc.nextLong();
            occurrenceOfDigit(num);
        }catch (InputMismatchException e){
            System.out.println(e);
        }

    }
    public static void occurrenceOfDigit(Long num){
        int count=0;
        while (num !=0){
            Long digit = num %10;
            count++;
            num=num/10;
        }
        System.out.println("Total number of digit"+"=" + count);
    }
}
