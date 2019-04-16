package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String ShoppingTask = "ShoppingTask";
    public static final String PaintingTask = "PaintingTask";
    public static final String DrivingTask = "DrivingTask";

    public final Task makeTask(final String taskType){
        switch(taskType){
            case ShoppingTask:
                ShoppingTask shoppingTask = new ShoppingTask("Make some Shopping","Banany",5.5);
                shoppingTask.executeTask();
                return shoppingTask;
            case PaintingTask:
                PaintingTask paintingTask = new PaintingTask("Make some Painting","White","Wall");
                paintingTask.executeTask();
                return paintingTask;
            case DrivingTask:
                DrivingTask drivingTask = new DrivingTask("Let's Drive","warsaw","bicycle");
                drivingTask.executeTask();
                return drivingTask;
            default:
                return null;
        }
    }
}
