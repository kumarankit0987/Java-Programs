package DSA;

import java.util.LinkedList;

public class Linked_List_Example1 {

    public static final LinkedList<String> list1 = new LinkedList<>();

    public static void main(String[] args) {
        // Create a LinkedList
        // add elements in Linked_List
        list1.add("Ankit");
        list1.add("Ajay");
        list1.add("Rana");
        list1.add("Raj");
        System.out.println(list1);// access the Linked list

        // Add element at specific index
        list1.add(3,"Bharat");
        System.out.println(list1);

        // Create 2nd Array list of The Linked_List
        LinkedList<String> list2 = new LinkedList<>();
        list2.add("Ram");
        list2.add("Shubham");

        ///Adding second list elements to the first list
        list1.addAll(list2);
        System.out.println("After invoking addAll(Collection<? extends E> c) method: " + list1);

        // Removing the element from LinkedList
        list1.remove("Rana");
        System.out.println("Remove the Rana from list1");
        System.out.println(list1);

        // Remove element of specific location
        list1.remove(2);
        System.out.println("Remove the element of index 2");
        System.out.println(list1); // Bharat is remove.
    }
}
