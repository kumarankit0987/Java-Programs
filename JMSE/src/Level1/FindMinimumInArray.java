package Level1;

public class FindMinimumInArray {
    public static void findSmallestElement(){
        int[] arr = {12,4,5,8,10,2};
        int min = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println(min);
    }

    public static void main(String[] args) {
        findSmallestElement();
    }
}
