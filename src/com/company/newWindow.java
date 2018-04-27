package com.company;

import java.util.ArrayList;
import java.util.List;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class newWindow {

    private LogController ctrl;
    JScrollPane scrollPane = new JScrollPane();
    JFrame frame = new JFrame ("Child Window");
    JPanel upper = new JPanel();
    JPanel lower = new JPanel();
    JTextField jTextField = new JTextField(0);
    List<String> lista;
    LogController logController;

    public newWindow(LogController logController, List<String> lista) {
        this.logController = logController;
        frame.setDefaultCloseOperation (JFrame.HIDE_ON_CLOSE);
        JButton addButton = new JButton("Add");
        frame.setIconImage(Toolkit.getDefaultToolkit().getImage("logo-pjatk.png"));
        frame.setLocationRelativeTo(null);
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                getText();
                printData(lista);
            }
        });

        JScrollPane scrollPane = new JScrollPane(upper);
        upper.setLayout(new BoxLayout(upper, BoxLayout.Y_AXIS));
        frame.getContentPane().add(BorderLayout.CENTER, scrollPane);
        frame.getContentPane().add(BorderLayout.SOUTH, lower);
        lower.add(jTextField);
        lower.add(addButton);
        lower.setLayout(new BoxLayout(lower, BoxLayout.LINE_AXIS));
        printData(lista);
        this.lista = lista;
        frame.pack();
        frame.setVisible (true);
        frame.setSize(500, 300);
    }

    public void getText() {
        lista.add(jTextField.getText());
        logController.heyThereIsANewValue();
    }

    public void printData(List<String> lista) {
        upper.removeAll();
        for (String s : lista) {
            JLabel jLabel = new JLabel(s.replaceAll("\\s+",""));
            upper.add(jLabel);
        }
        frame.pack();
        frame.setSize(500, 300);
    }

    public void refresh() {
        printData(this.lista);
    }
}
