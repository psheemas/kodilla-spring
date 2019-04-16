package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String ShoppingTask = "ShoppingTask";
    public static final String PaintingTask = "PaintingTask";
    public static final String DrivingTask = "DrivingTask";

    public final Task makeTask(final String taskType){
        switch(taskType){
            case ShoppingTask:
                return new ShoppingTask("Make some Shopping","Banany",5.5);
            case PaintingTask:
                return new PaintingTask("Make some Painting","White","Wall");
            case DrivingTask:
                return new DrivingTask("Let's Drive","warsaw","bicycle");
            default:
                return null;
        }
    }
}
