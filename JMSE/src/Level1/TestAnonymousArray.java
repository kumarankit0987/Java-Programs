package Level1;

public class TestAnonymousArray {
    public static void printArray(int[] arr){
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }

    public static void main(String[] args) {
        printArray(new int[]{10,12,23,43,45});
    }
}
