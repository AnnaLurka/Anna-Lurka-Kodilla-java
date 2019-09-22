package com.kodilla.testing.shape;

import org.junit.*;
import java.util.*;


public class ShapeCollectorTestSuite {

    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }

    @After
    public void after(){
        System.out.println("Test Case: end");
    }

    @BeforeClass
    public static void beforeAllTests(){
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests(){
        System.out.println("This is the end of tests.");
    }

    @Test
    public void testAddFigure(){
        //Given
        ArrayList<Shape> shapes = new ArrayList<Shape>();
        Triangle triangle = new Triangle();
        Circle circle = new Circle();
        Square square = new Square();

        shapes.addFigure(triangle);
        shapes.addFigure(circle);

        //When
        shapes.addFigure(square);

        //Then
        Assert.assertEquals(3,shapes.getShapesQuantity());
    }

    @Test
    public void testRemoveFigure(){
        //Given
        ArrayList<Shape> shapes = new ArrayList<Shape>();
        Triangle triangle = new Triangle();
        Circle circle = new Circle();
        Square square = new Square();

        shapes.addFigure(triangle);
        shapes.addFigure(circle);
        shapes.addFigure(square);

        //When
        boolean result = shapes.removeFigure(square);

        //Then
        Assert.assertEquals(2,shapes.getShapesQuantity());
    }

    @Test
    public void testGetFigure(){
        //Given
        ArrayList<Shape> shapes = new ArrayList<Shape>();
        Triangle triangle = new Triangle();
        Circle circle = new Circle();
        Square square = new Square();

        shapes.addFigure(triangle);
        shapes.addFigure(circle);
        shapes.addFigure(square);

        //When
        
        Shape retrievedFigure;
        retrievedFigure = shapes.getFigure(1);

        //Then
        Assert.assertEquals(circle, retrievedFigure);
    }
}
