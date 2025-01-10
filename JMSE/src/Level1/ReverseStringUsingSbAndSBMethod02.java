package Level1;

public class ReverseStringUsingSbAndSBMethod02 {
    public static void main(String[] args) {
        String str = "Hello";
        System.out.println("Original String:" + " " + str);
        //Using StringBuilder method to reverse String
        //Create a StringBuilder Method
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        String rev_str = sb.toString();
        System.out.println("Reverse String using StringBuilder Method:"+ " " + rev_str);

        //Using StringBuffer method to Reverse the String
        StringBuffer stringBuffer = new StringBuffer(str);
        stringBuffer.reverse();
        String rev_String = stringBuffer.toString();
        System.out.println("Reverse String using StringBuffer Method:"+ " " + rev_String);
    }
}
