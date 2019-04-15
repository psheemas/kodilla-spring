package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BoardTestSuite {
    @Test
    public void testTaskAdd(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        //When
        board.getToDoList().addTask("toDoTask");
        board.getInProgressList().addTask("inProgressTask");
        board.getDoneList().addTask("doneTask");

        // Then
        Assert.assertEquals(true,board.getToDoList().getTask().contains("toDoTask"));
        Assert.assertEquals(true,board.getInProgressList().getTask().contains("inProgressTask"));
        Assert.assertEquals(true,board.getDoneList().getTask().contains("doneTask"));


    }
}
