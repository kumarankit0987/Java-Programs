package com.company;

public class VarArgsExample {
    static int sum(int x, int y, int z) {
        int sum = x + y + z; // This sum method has three parameters
        return sum;
    }

    static int sum(int x, int y, int z, int d) {
        int sum = x + y + z + d;
        return sum;
    }

    // Now we create varargs and see what is its use.
    static int sum(int ...arr) {
        // its return in form of array like int arr [];
        int resultOfSum = 0;
        for(int element : arr ){
            resultOfSum = resultOfSum + element;
        }
        return resultOfSum;
    }
    public static void main(String[] args) {
        System.out.println("This result is 1st overload method" + " " + sum(2,4,6));
        System.out.println("This result is 2nd overload method" + " " + sum(3,6,9,8));
        System.out.println("This output is of varargs" + " " + sum(2, 4, 6,8,9,8,7,6,5));
    }
}
