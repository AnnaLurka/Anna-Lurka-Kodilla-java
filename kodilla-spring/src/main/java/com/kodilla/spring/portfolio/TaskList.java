package com.kodilla.spring.portfolio;

import java.util.ArrayList;
import java.util.List;

public class TaskList {

    private List<String> tasks;
    String task;


    public TaskList() {
        tasks = new ArrayList<>();
    }

    public String getTask() {
        return task;
    }

    public void taskAdd(String task) {
        tasks.add(task);
    }
}
