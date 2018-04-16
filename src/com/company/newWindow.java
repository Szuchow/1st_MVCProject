package com.company;

import java.awt.event.TextListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class newWindow {


    JFrame frame = new JFrame ("MyPanel");

    JPanel Data = new JPanel();
    JPanel lower = new JPanel();
    JTextField jTextField = new JTextField(0);
    public newWindow() {
        frame.setDefaultCloseOperation (JFrame.HIDE_ON_CLOSE);

        jTextField.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                test();


            }
        });


        JScrollPane scrollPane = new JScrollPane(Data);
        JButton addButton = new JButton("Add");

        frame.getContentPane().add(BorderLayout.NORTH, scrollPane);
        frame.getContentPane().add(BorderLayout.SOUTH, lower);

        //lower.add(scrollPane);
        lower.add(jTextField);
        lower.add(addButton);
        lower.setLayout(new BoxLayout(lower, BoxLayout.LINE_AXIS));

        frame.pack();
        frame.setVisible (true);
        frame.setSize(500, 300);
    }

    public void test() {

        new Log(jTextField.getText());


    }



}
