package com.kodilla.patterns.factory.tasks;

public class DrivingTask implements Task {
    private String taskName;
    private String where;
    private String using;
    private boolean taskStatus = false;

    public DrivingTask(String taskName, String where, String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }
    @Override
    public void executeTask(){
        this.taskStatus = true;
    }

    @Override
    public String getTaskName(){
        return this.taskName;
    }

    @Override
    public boolean isTaskExecuted(){
        return taskStatus;
    }

    public String getWhere() {
        return where;
    }

    public String getUsing() {
        return using;
    }
}
