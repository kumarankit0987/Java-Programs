package Level1;

import java.util.Scanner;

public class ReverseNumberUsingWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input");
        int num = sc.nextInt();
        int rev=0;
        System.out.println("Original Number:" + " " + num);

        while(num!=0){
            int rem = num%10;
            rev= rev*10+rem;
            num=num/10;
        }
        System.out.println("Reverse Number:"+ " " + rev);
    }
}
