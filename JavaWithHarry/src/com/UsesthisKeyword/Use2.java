package com.UsesthisKeyword;

public class Use2 {
    // this keyword can be used to invoke the current class method(implicitly).
    void display() {
        System.out.println("Hello");
    }
    void show() {
        this.display(); // display();
        // this keyword is default if we not use this
        // compiler automatically or by default add this keyword
    }
    public static void main(String[] args) {
        Use2 obj = new Use2();
        obj.show();
    }
}
