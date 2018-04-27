package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class LogView extends JFrame {

   private LogController ctrl;

   JLabel hi = new JLabel("Hello Guest!");
   JButton newW = new JButton("Start");
   JPanel jPanel = new JPanel();
    List<String> lista;

   public LogView(LogController logController, List<String> lista) {
       this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
       this.setTitle("");
       this.setIconImage(Toolkit.getDefaultToolkit().getImage("logo-pjatk.png"));
       this.ctrl = logController;
       init();
       this.lista = lista;
   }

   private void init() {
       pack();
       setSize(500, 300);
       setLocationRelativeTo(null);
   }

   public void firstWindow() {
       Box a = Box.createVerticalBox();
       a.add(hi);
       a.add(Box.createRigidArea(new Dimension(110, 200)));
       a.add(newW);
       add(a);
       newW.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent e) {
               ctrl.onButtonClick(e);
           }
       });
   }

   public void start()
   {
       setVisible(true);
   }

}
