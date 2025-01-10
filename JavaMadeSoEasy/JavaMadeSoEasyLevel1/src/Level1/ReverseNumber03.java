package Level1;

public class ReverseNumber03 {
    public static void main(String[] args) {
        int no = 1234;
        System.out.println("Original no:" + " " + no);
        int reverse =0;
        reverseNumber(no,reverse);
    }

    public static void reverseNumber(int no,int reverse){
        while(no!=0){
            int rem = no % 10;
            reverse = reverse * 10 + rem;
            no=no/10;
        }
        System.out.print("Reverse no:");
        System.out.print(reverse);
    }
}
