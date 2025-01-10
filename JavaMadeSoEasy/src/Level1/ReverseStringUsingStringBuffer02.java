package Level1;

public class ReverseStringUsingStringBuffer02 {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("HelloWorld");
        System.out.println("Original String:" + " " + str);

        //Reverse String Using StringBuffer
        str.reverse();
        System.out.println("Reverse String:" + " " + str);
    }
}
