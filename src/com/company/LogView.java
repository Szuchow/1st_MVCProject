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



   public LogView(LogController logController) {
       this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); //zamyka wszystkie okna?
       this.setTitle("");
       this.setIconImage(Toolkit.getDefaultToolkit().getImage("logo-pjatk.png"));
       this.ctrl = logController;

       pack();
       setSize(500, 300);
       setLocationRelativeTo(null);
       init();
   }

   private void init() {
       //jPanel.setLayout(new BoxLayout(jPanel, BoxLayout.Y_AXIS));

   }

    public void showLogs(List<Log> data) {
        for (Log log : data) {
            JLabel jLabel = new JLabel(log.toString());
            getContentPane().add(jLabel);
        }
    }


   public void firstWindow() {

       Box a = Box.createVerticalBox();
       a.add(hi);
       a.add(Box.createRigidArea(new Dimension(110, 200)));
       a.add(newW);

       add(a);
       newW.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               ctrl.onButtonClick(e);
           }
       });
   }


   public void start() {
       setVisible(true);
   }

   public void clearLogs() {
       // TODO Auto-generated method stub

   }

}
