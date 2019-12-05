package com.kodilla.spring.portfolio;

import java.util.ArrayList;
import java.util.List;

public class TaskList {

    private List<String> tasks;
    //private List<String> tasks = new ArrayList<>();

    public TaskList() {
        tasks = new ArrayList<>();
    }

    public List<String> getTasks() {
        return tasks;
    }

    public void taskAdd(String task) {
        tasks.add(task);
    }
}
