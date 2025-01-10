package Level1;

public class FibonacciSeries04 {
    public static void fibonacciNumber(int N){
       int num1 = 0;
       int num2 = 1;
       for(int i=1; i<N; i++){
           System.out.print(num1 + " ");
           int num3 = num1 + num2;
           num1 = num2;
           num2= num3;
       }
     }

    public static void main(String[] args) {
        fibonacciNumber(10);
    }
}
