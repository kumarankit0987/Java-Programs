package Level1;

import java.util.Scanner;

public class PrimeNumber05 {
    public static void main(String[] args) {
        int factorial=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Input no");
        int no=sc.nextInt();
        checkPrimeNumber(no,factorial);
    }
    public static void checkPrimeNumber(int no,int factorial){
        for(int i=1; i<=no; i++){
            if(no %i==0){
                factorial=factorial +1;
            }
        }
        if(factorial==2){
            System.out.println("Prime Number");
        }
        else{
            System.out.println("Not Prime");
        }
    }
}
