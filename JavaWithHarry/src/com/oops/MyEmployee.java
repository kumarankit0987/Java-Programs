package com.oops;

public class MyEmployee {
    String name;
    int id;
    // Create a constructor
    MyEmployee() { // we can see constructor name is similar to class name
        // constructor have default access modifiers and no return types
        String name = "Ankit";
        int id = 1098;
        System.out.println(name + " " + id);
    }

    public static void main(String[] args) {
        // create the object of MyEmployee class
        MyEmployee emp1 = new MyEmployee();
        // As we can see constructor executes automatically when we create an object
    }
}
