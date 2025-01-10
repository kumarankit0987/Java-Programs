package Level1;

import java.util.Scanner;

public class Factorial08 {
    public static void main(String[] args) {
        int factorial=1;
        // First Take Input Number from the user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Input Number");
        int num = sc.nextInt();
        factorialOfNumber(num,factorial);
    }
    public static void factorialOfNumber(int num,int factorial){
        for(int i=1; i<=num; i++){
            factorial = factorial *i;
        }
        System.out.println("Factorial of" + " " + num + "= " + factorial);
    }
}
