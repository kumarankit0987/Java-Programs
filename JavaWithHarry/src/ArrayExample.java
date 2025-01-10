public class ArrayExample {
    public static void main(String[] args) {
        System.out.println("First I declare the int type of  array and then declare the size of array");
        int arr [];
        System.out.println("I am initializing an array of size 10");
        arr = new int[10];

        System.out.println("Now the declaration  and memory location  together ");
        int arr01[] = new int[10];

        System.out.println("Now declaration memory location and initialization together");
        int arr02[] = {1,2,3,4,5,6};

        System.out.println("Now declare the float type array");
        float arr1 [];
        System.out.println("Now I declare the size of array");
        arr1 = new float[10];
        // Add the value to integer
        arr1 [0] = 10.0f;
        arr1[1] = 3.9f;

        System.out.println("Declare the char type of array ");
        char arr2 [];
        arr2 = new char[10];
        arr2[0] = 'a';
        arr2[1] = 'b';
    }
}
