package com.company;

public class LogicalOperator {
    public static void main(String[] args) {
        // Evaluate to  true if both Condition are true
        boolean a = true;
        boolean b = true;
        if(a && b) {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }

        // For Logical OR ||
        if(a || b) {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }
}
