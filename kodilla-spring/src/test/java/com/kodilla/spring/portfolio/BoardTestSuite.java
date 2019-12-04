package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class BoardTestSuite {

    @Test
    public void testTaskAdd() {

        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Board board = context.getBean(Board.class);

        //When
        board.getToDoList().taskAdd("shopping");
        board.getInProgressList().taskAdd("washing");
        board.getDoneList().taskAdd("cooking");
        String result1 = board.getToDoList().getTasks().get(0);
        String result2 = board.getInProgressList().getTasks().get(0);
        String result3 = board.getDoneList().getTasks().get(0);

        //Then
        Assert.assertEquals("shopping", result1);
        Assert.assertEquals("washing", result2);
        Assert.assertEquals("cooking", result3);
    }
}
