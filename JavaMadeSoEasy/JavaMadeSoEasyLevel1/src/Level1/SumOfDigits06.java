package Level1;

import java.util.Scanner;

public class SumOfDigits06 {
    public static void main(String[] args) {
        int sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Input Number");
        int no = sc.nextInt();
        System.out.println("Sum of digits:" + " " + sumOfDigits(no,sum));
    }
    public static int sumOfDigits(int no,int sum){
      while(no>0){
          int digit = no%10;
          sum=sum+digit;
          no=no/10;
      }

      return sum;
    }
}
