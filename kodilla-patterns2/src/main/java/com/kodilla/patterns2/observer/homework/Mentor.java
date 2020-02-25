package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer {
    private final String name;

    public Mentor(String name) {
        this.name = name;
    }

    @Override
    public void update(TasksQueue tasksQueue) {
        System.out.println(name + ": A new task in queue " + tasksQueue.getName() + " has been added. " +
                "\n" + " Total tasks in the queue: " + tasksQueue.getTasks().size() + ((tasksQueue.getTasks().size() == 1) ? " task" : " tasks"));
    }

    public String getName() {
        return name;
    }
}
