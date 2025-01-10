import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Input");
        String str = sc.next();
        String rev_str = "";
        System.out.println("Original String:" + " " + str);
        for(int i=str.length()-1; i>=0; i--){
            rev_str = rev_str + str.charAt(i);
        }
        System.out.println("Reverse of String:" + " " + rev_str);
    }
}
