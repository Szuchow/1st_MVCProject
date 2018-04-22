package com.company;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class LogModel {
    private final LogController ctrl;
    private List<Log> data;
    JTextField jTextField = new JTextField(0);

    public LogModel(LogController logController) {
        this.ctrl = logController;
        this.data = new ArrayList<>();
    }

    public void dumpData() {
       // this.data.add(new Log(newWindow.test()));



    }

    public void setData() {

    }

    public List<Log> getData() {
        return data;
    }

    public void clearData() {
        // TODO Auto-generated method stub

    }
}
