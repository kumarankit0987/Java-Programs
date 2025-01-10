package Level1;

public class PrimeNumber05 {

    public static void checkPrime(int num){

        for(int i=num; i<=num; i++){
            int count=0;
            for(int j=1; j<=i; j++){
                if(i%j==0){
                    count++;
                }
            }
            if(count==2){
                System.out.println(num + " is a prime Number");

            }else{
                System.out.println(num + "  is  not a prime Number" );
        }
    }
}
    public static void main(String[] args) {
        checkPrime(8);
    }
}
