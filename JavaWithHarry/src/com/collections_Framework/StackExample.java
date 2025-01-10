package com.collections_Framework;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> myStack = new Stack<>();
        myStack.push(101);
        myStack.push(120);
        myStack.push(106);
        myStack.push(190);

        for(int i =0; i<= myStack.size(); i++) {

        }
        System.out.println(myStack);
    }
}
