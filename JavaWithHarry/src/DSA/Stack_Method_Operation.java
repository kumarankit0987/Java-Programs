package DSA;

import java.util.Stack;

public class Stack_Method_Operation {
    public static void main(String[] args) {
        // Create a Stack
        Stack<Integer> myStack = new Stack<>();

        // Check stack is empty or not
        boolean result = myStack.empty();
        System.out.println(result);

        // pushing element into the stack using
        myStack.push(12);
        myStack.push(11);
        myStack.push(10);
        myStack.push(9);
        myStack.push(8);

        // Access the elements of stack
        System.out.println("Elements :" + myStack);

        // Now pop the elements from the stack
        int popElement = myStack.pop();
        System.out.println("POP element : " + popElement);

        // peek element from the top
        int peekElement = myStack.peek();
        System.out.println("Peek element : " + peekElement);
        System.out.println("pop the top element" + myStack.pop());

        // search method to search the element present or not in stack
        System.out.println(myStack);
        int location = myStack.search("11");
        System.out.println("location : " + location);

        // check the size of the stack
        System.out.println("Size of stack : " + myStack.size());
        }
    }