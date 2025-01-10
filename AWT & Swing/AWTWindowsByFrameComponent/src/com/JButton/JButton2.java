package com.JButton;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JButton2 {
    public static void main(String[] args) {
        JFrame f = new JFrame("JButton2");
        // Create textField
        final JTextField tf = new JTextField();
        tf.setBounds(50,50,150,20);

        // Create Button
        JButton b = new JButton("Click");
        b.setBounds(50,100,95,30);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
}
