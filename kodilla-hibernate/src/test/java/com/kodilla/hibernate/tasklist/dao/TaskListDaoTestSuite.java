package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
    public class TaskListDaoTestSuite{
    @Autowired
    private TaskListDao taskListDao;
    private static final String TEST = "check 17.2";

    @Test
    public void testFindByListName(){
        //Given
        TaskList taskList = new TaskList(TEST,TEST);
        taskListDao.save(taskList);
        String checkingListName = taskList.getListName();

        //When
        List<TaskList> readTask = taskListDao.findByListName(checkingListName);

        //Then
        Assert.assertEquals("check 17.2",readTask.get(0).getListName());

        //CleanUp
        int addedTask = readTask.get(0).getId();
        taskListDao.deleteById(addedTask);
    }
}
