package com.kodilla.testing.collection;
import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.*;
import java.util.*;

public class CollectionTestSuite {

    @Before
    public void before(){
        System.out.println("Test Case: begin");
}

    @After
    public void after(){
        System.out.println("Test Case: end");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList(){
        //Given
        ArrayList<Integer> emptyList = new ArrayList<Integer>();

        //When
        ArrayList<Integer> result1 = emptyList.exterminate();
        System.out.println("Testing " + result1);

        //Then
        Assert.assertEquals([], result1); //???
    }

    @Test
    public void testOddNumbersExterminatorNormalList(){
        //Given
        ArrayList<Integer> normalList = new ArrayList<Integer>();
        normalList.add(1);
        normalList.add(2);
        normalList.add(3);
        normalList.add(4);
        normalList.add(5);
        normalList.add(6);
        normalList.add(7);
        normalList.add(8);

        //When
        ArrayList<Integer> result2 = normalList.exterminate();
        System.out.println("Testing " + result2);

        //Then
        Assert.assertEquals([2,4,6,8], result2); //???
    }
}
