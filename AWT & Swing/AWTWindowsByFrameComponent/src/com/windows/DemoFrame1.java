package com.windows;

import java.awt.*;

// Inherit Frame
public class DemoFrame1 extends Frame {

    // Provide Title,  width and height in constructor
    DemoFrame1(String s, int i, int j){
        // Call title of parent class
        super(s);
        // set width and height by using setSize method
        setSize(i,j);

        setVisible(true);
    }

    public static void main(String[] args) {
        new DemoFrame1("First Frame",400, 400 );
        new DemoFrame1("Second Frame",200,200);
    }
}
