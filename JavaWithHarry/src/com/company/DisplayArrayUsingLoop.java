package com.company;

public class DisplayArrayUsingLoop {
    public static void main(String[] args) {
        // we are storing the marks of 5 student
        int marks [] = {80,67,98,87,90}; // store 5 students of marks.
        // Now we will find the length of array means how many elements store in marks .
        System.out.println(marks.length); // we get the length of array.

        // Access the elements in normal ways is so pity
        System.out.println("Print the element in normal way");
        System.out.println("......................");
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);

        // Now we display the arrays using for loop as we can see to many code is written
        // But using for loop only two line of code will write
        System.out.println("Using for loop");
        System.out.println("..........................");
        for(int i =0; i <marks.length; i++) {
            System.out.println(marks[i]);
            // Now using  for each loop
            System.out.println("using for each loop");
            System.out.println("..........................");
            for(int element : marks) {
                System.out.println(element);
            }
        }
    }
}
