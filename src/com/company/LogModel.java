package com.company;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class LogModel {
    private final LogController ctrl;
    private List<Log> data;


    public LogModel(LogController logController) {
        this.ctrl = logController;
        this.data = new ArrayList<>();
    }
}
