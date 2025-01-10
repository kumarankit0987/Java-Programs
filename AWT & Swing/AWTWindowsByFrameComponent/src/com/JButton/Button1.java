package com.JButton;

import javax.swing.*;

public class Button1 {
    public static void main(String[] args) {
        JFrame f = new JFrame("Button Example1");
        JButton b = new JButton("Click here");
        b.setBounds(50,100,95,30);

        f.add(b);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
}
