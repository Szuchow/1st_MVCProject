package com.company;

import java.awt.event.ActionEvent;

public class LogController {

    private LogModel logModel;
    private LogView logView;

    public LogController() {
        logModel = new LogModel(this);
        logView = new LogView(this);
    }

    public void start() {
        logModel.dumpData();
        //logView.showLogs(logModel.getData());
        logView.start();
        logView.firstWindow();
        logModel.getData();
    }


    public void onButtonClick(ActionEvent e) {
        new newWindow();

    }




}
