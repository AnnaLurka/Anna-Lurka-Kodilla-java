package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {

    @Test
    public void testCalculations() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        double a = 10;
        double b = 5;
        //When
        double addition = calculator.add(a, b);
        double subtraction = calculator.sub(a, b);
        double multiplication = calculator.mul(a, b);
        double division = calculator.div(a, b);
        //Then
        Assert.assertEquals(15, addition, 0);
        Assert.assertEquals(5, subtraction, 0);
        Assert.assertEquals(50, multiplication, 0);
        Assert.assertEquals(2, division, 0);
    }
}
