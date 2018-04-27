package com.company;

import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;

public class LogController {

    private LogModel logModel;
    private LogView logView;


    List<String> lista = new ArrayList();
    List<newWindow> x = new ArrayList();

    public LogController() {
        logModel = new LogModel(this);
        logView = new LogView(this, lista);
    }

    public void start() {
        logView.start();
        logView.firstWindow();
    }

    public void onButtonClick(ActionEvent e) {
        x.add(new newWindow(this, lista));

    }

    public void heyThereIsANewValue() {
        for (newWindow el : x) {
            el.refresh();
        }
    }
}
