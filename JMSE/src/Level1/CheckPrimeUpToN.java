package Level1;

public class CheckPrimeUpToN {
    public static void checkPrime(int N){
        System.out.print("Prime Number :" + " ");
        // This for loop for that N numbers
        for(int i=2; i<=N; i++){
            //This for loop to check that number
            int count=0;
            for(int j=1; j<=i; j++){
                if(i % j==0){
                   count = count + 1;
                }
            }
            if(count==2){
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        checkPrime(100);
    }
}
