package com.company;

import java.util.ArrayList;
import java.util.List;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class newWindow {


    List<String> lista = new ArrayList();
    List<newWindow> refreshList = new ArrayList<>();
    
    JScrollPane scrollPane = new JScrollPane();


    JFrame frame = new JFrame ("MyPanel");
    JPanel upper = new JPanel();
    JPanel lower = new JPanel();


    JTextField jTextField = new JTextField(0);



    public newWindow() {
        frame.setDefaultCloseOperation (JFrame.HIDE_ON_CLOSE);
        JButton addButton = new JButton("Add");

        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                upper.revalidate();
                upper.repaint();
                test();
                printData(lista);
            }
        });


        JScrollPane scrollPane = new JScrollPane(upper);
        upper.setLayout(new BoxLayout(upper, BoxLayout.Y_AXIS));


        frame.getContentPane().add(BorderLayout.CENTER, scrollPane);
        frame.getContentPane().add(BorderLayout.SOUTH, lower);
        //upper.add(new JButton("j"));
        //lower.add(scrollPane);
        lower.add(jTextField);
        lower.add(addButton);
        lower.setLayout(new BoxLayout(lower, BoxLayout.LINE_AXIS));

        frame.pack();
        frame.setVisible (true);
        frame.setSize(500, 300);
    }

    public void test() {


        //Data1.add(scrollPane);
        lista.add(jTextField.getText());

    }

    public void printData(List<String> lista) {
        upper.removeAll();
        for (String s : lista) {
            JLabel jLabel = new JLabel(s);
            upper.add(jLabel);



        }
        frame.pack();
        frame.setSize(500, 300);
    }



}
