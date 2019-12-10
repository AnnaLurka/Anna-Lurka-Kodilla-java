package com.kodilla.patterns.factory.tasks;

import java.util.ArrayList;
import java.util.List;

public final class PaintingTask implements Task{

    final String taskName;
    final String color;
    final String whatToPaint;
    boolean taskExecuted;

    public PaintingTask(final String taskName, final String color, final String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }

    @Override
    public String getTaskName(){
        return taskName;
    }

    @Override
    public String executeTask(){
        System.out.println("Executing Painting Task.");
        taskExecuted = true;
        return "Painting " + whatToPaint + " " + color + ".";
    }

    @Override
    public boolean isTaskExecuted() {

        List<String> itemsPainted = new ArrayList<>();
        List<String> itemsNotPainted = new ArrayList<>();

        if(taskExecuted) {
            itemsPainted.add(taskName);
            return true;
        } else {
            itemsNotPainted.add(taskName);
            return false;
        }
    }
}
