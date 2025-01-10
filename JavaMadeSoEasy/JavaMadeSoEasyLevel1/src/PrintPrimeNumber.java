public class PrintPrimeNumber {
    public static void main(String[] args) {

       printPrimeNumber();
    }
    public static void printPrimeNumber(){
        for(int i=1; i<=100; i++){
            int factorial=0;
            for(int j=1; j<=i; j++){
                if(i %j==0){
                    factorial = factorial+1;
                }
            }
            if(factorial==2){
                System.out.print(i + " ");
            }
        }
    }
}
