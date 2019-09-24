package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticsCalculatorTestSuite {

    @Test
    public void testCalculateAdvStatistics0Posts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();

        ArrayList<Double> statisticsList0Posts = new ArrayList<Double>();
        double avePostsPerUser = 0;
        double aveCommentsPerUser = 0;
        double aveCommentsPerPost = 0;

        statisticsList0Posts.add(avePostsPerUser);
        statisticsList0Posts.add(aveCommentsPerUser);
        statisticsList0Posts.add(aveCommentsPerPost);

        //When
        ArrayList<Double> list0Posts = statisticsCalculator.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(statisticsList0Posts, list0Posts);
    }
    @Test
    public void testCalculateAdvStatistics1000Posts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();

        ArrayList<Double> statisticsList1000Posts = new ArrayList<Double>();
        double avePostsPerUser = 3.13;
        double aveCommentsPerUser = 2.11;
        double aveCommentsPerPost = 5.12;

        statisticsList1000Posts.add(avePostsPerUser);
        statisticsList1000Posts.add(aveCommentsPerUser);
        statisticsList1000Posts.add(aveCommentsPerPost);

        //When
        ArrayList<Double> list1000Posts = statisticsCalculator.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(statisticsList1000Posts, list1000Posts);
    }

    @Test
    public void testCalculateAdvStatistics0Comments() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();

        ArrayList<Double> statisticsList0Comments = new ArrayList<Double>();
        double avePostsPerUser = 3.44;
        double aveCommentsPerUser = 0;
        double aveCommentsPerPost = 0;

        statisticsList0Comments.add(avePostsPerUser);
        statisticsList0Comments.add(aveCommentsPerUser);
        statisticsList0Comments.add(aveCommentsPerPost);

        //When
        ArrayList<Double> list0Comments = statisticsCalculator.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(statisticsList0Comments, list0Comments);
    }

    @Test
    public void testCalculateAdvStatisticsCommentsLessThanPosts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();

        ArrayList<Double> statisticsListCommentsLessThanPosts = new ArrayList<Double>();
        double avePostsPerUser = 1.42;
        double aveCommentsPerUser = 0.28;
        double aveCommentsPerPost = 0.20;

        statisticsListCommentsLessThanPosts.add(avePostsPerUser);
        statisticsListCommentsLessThanPosts.add(aveCommentsPerUser);
        statisticsListCommentsLessThanPosts.add(aveCommentsPerPost);

        //When
        ArrayList<Double> listCommentsLessThanPosts = statisticsCalculator.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(statisticsListCommentsLessThanPosts, listCommentsLessThanPosts);
    }
    @Test
    public void testCalculateAdvStatisticsCommentsMoreThanPosts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();

        ArrayList<Double> statisticsListCommentsMoreThanPosts = new ArrayList<Double>();
        double avePostsPerUser = 5.66;
        double aveCommentsPerUser = 3.22 ;
        double aveCommentsPerPost = 2.14;

        statisticsListCommentsMoreThanPosts.add(avePostsPerUser);
        statisticsListCommentsMoreThanPosts.add(aveCommentsPerUser);
        statisticsListCommentsMoreThanPosts.add(aveCommentsPerPost);

        //When
        ArrayList<Double> listCommentsMoreThanPosts = statisticsCalculator.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(statisticsListCommentsMoreThanPosts, listCommentsMoreThanPosts);
    }
    @Test
    public void testCalculateAdvStatistics0Users() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();

        ArrayList<Double> statisticsList0Users = new ArrayList<Double>();
        double avePostsPerUser = 0;
        double aveCommentsPerUser = 0;
        double aveCommentsPerPost = 0;

        statisticsList0Users.add(avePostsPerUser);
        statisticsList0Users.add(aveCommentsPerUser);
        statisticsList0Users.add(aveCommentsPerPost);

        //When
        ArrayList<Double> list0Users = statisticsCalculator.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(statisticsList0Users, list0Users);
    }
    @Test
    public void testCalculateAdvStatistics100Users() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();

        ArrayList<Double> statisticsList100Users = new ArrayList<Double>();
        double avePostsPerUser = 4.55;
        double aveCommentsPerUser = 6.88;
        double aveCommentsPerPost = 5.99;


        statisticsList100Users.add(avePostsPerUser);
        statisticsList100Users.add(aveCommentsPerUser);
        statisticsList100Users.add(aveCommentsPerPost);

        //When
        ArrayList<Double> list100Users = statisticsCalculator.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(statisticsList100Users, list100Users);
    }
}