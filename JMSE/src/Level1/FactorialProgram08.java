package Level1;

public class FactorialProgram08 {
    public static int factorial(int num){
        int factorial =1;
        for(int i=1; i<=num; i++){
            factorial = factorial * i;
        }
        return factorial;
    }

    public static void main(String[] args) {
        int result = factorial(5);
        System.out.println("Factorial :" + result);
    }
}
