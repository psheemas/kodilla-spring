package com.kodilla.patterns.factory.tasks;

public class PaintingTask implements Task{
    private String taskName;
    private String color;
    private String whatToPaint;
    private boolean taskStatus = false;

    public PaintingTask(String taskName, String color, String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
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

    public String getColor() {
        return color;
    }

    public String getWhatToPaint() {
        return whatToPaint;
    }
}
