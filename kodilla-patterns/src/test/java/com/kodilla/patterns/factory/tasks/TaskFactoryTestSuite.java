package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testShoppingTask(){
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task shoppingTask = factory.makeTask(TaskFactory.ShoppingTask);
        //Then
        Assert.assertEquals("Make some Shopping",shoppingTask.getTaskName());
        Assert.assertEquals(true,shoppingTask.isTaskExecuted());
    }

    @Test
    public void testPaintingTask(){
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task paintingTask = factory.makeTask(TaskFactory.PaintingTask);
        //Then
        Assert.assertEquals("Make some Painting",paintingTask.getTaskName());
    }

    @Test
    public void testDrivingTask(){
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task drivingTask = factory.makeTask(TaskFactory.DrivingTask);
        //Then
        Assert.assertEquals("Let's Drive",drivingTask.getTaskName());
    }
}
