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
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator(statisticsMock);

        ArrayList<Double> statisticsList0Posts = new ArrayList<Double>();
        double avePostsPerUser = 0/statisticsMock.usersNames().size();
        double aveCommentsPerUser = 7 /statisticsMock.usersNames().size();
        double aveCommentsPerPost = 7/0;

        double postsCount = 0;
        if (postsCount == 0) {
            aveCommentsPerPost = 0;
        }
        if (statisticsMock.usersNames().size() == 0) {
            avePostsPerUser  = 0;
            aveCommentsPerUser = 0;
        }

        statisticsList0Posts.add(avePostsPerUser);
        statisticsList0Posts.add(aveCommentsPerUser);
        statisticsList0Posts.add(aveCommentsPerPost);

        //When
        ArrayList<Double> list0Posts = statisticsCalculator.calculateAdvStatistics().size();

        //Then
        Assert.assertEquals(3, list0Posts);
    }
    @Test
    public void testCalculateAdvStatistics1000Posts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator(statisticsMock);

        ArrayList<Double> statisticsList1000Posts = new ArrayList<Double>();
        double avePostsPerUser = 1000/statisticsMock.usersNames().size();
        double aveCommentsPerUser = 15 /statisticsMock.usersNames().size();
        double aveCommentsPerPost = 15/1000;


        if (statisticsMock.usersNames().size() == 0) {
            avePostsPerUser  = 0;
            aveCommentsPerUser = 0;
        }

        statisticsList1000Posts.add(avePostsPerUser);
        statisticsList1000Posts.add(aveCommentsPerUser);
        statisticsList1000Posts.add(aveCommentsPerPost);

        //When
        ArrayList<Double> list1000Posts = statisticsCalculator.calculateAdvStatistics().size();

        //Then
        Assert.assertEquals(3, list1000Posts);
    }

    @Test
    public void testCalculateAdvStatistics0Comments() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator(statisticsMock);

        ArrayList<Double> statisticsList0Comments = new ArrayList<Double>();
        double avePostsPerUser = 7/statisticsMock.usersNames().size();
        double aveCommentsPerUser = 0 /statisticsMock.usersNames().size();
        double aveCommentsPerPost = 0/7;


        if (statisticsMock.usersNames().size() == 0) {
            avePostsPerUser  = 0;
            aveCommentsPerUser = 0;
        }

        statisticsList0Comments.add(avePostsPerUser);
        statisticsList0Comments.add(aveCommentsPerUser);
        statisticsList0Comments.add(aveCommentsPerPost);

        //When
        ArrayList<Double> list0Comments = statisticsCalculator.calculateAdvStatistics().size();

        //Then
        Assert.assertEquals(3, list0Comments);
    }

    @Test
    public void testCalculateAdvStatisticsCommentsLessThanPosts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator(statisticsMock);

        ArrayList<Double> statisticsListCommentsLessThanPosts = new ArrayList<Double>();
        double avePostsPerUser = 15/statisticsMock.usersNames().size();
        double aveCommentsPerUser = 7 /statisticsMock.usersNames().size();
        double aveCommentsPerPost = 7/15;


        if (statisticsMock.usersNames().size() == 0) {
            avePostsPerUser  = 0;
            aveCommentsPerUser = 0;
        }

        statisticsListCommentsLessThanPosts.add(avePostsPerUser);
        statisticsListCommentsLessThanPosts.add(aveCommentsPerUser);
        statisticsListCommentsLessThanPosts.add(aveCommentsPerPost);

        //When
        ArrayList<Double> listCommentsLessThanPosts = statisticsCalculator.calculateAdvStatistics().size();

        //Then
        Assert.assertEquals(3, listCommentsLessThanPosts);
    }
    @Test
    public void testCalculateAdvStatisticsCommentsMoreThanPosts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator(statisticsMock);

        ArrayList<Double> statisticsListCommentsMoreThanPosts = new ArrayList<Double>();
        double avePostsPerUser = 7/statisticsMock.usersNames().size();
        double aveCommentsPerUser = 15 /statisticsMock.usersNames().size();
        double aveCommentsPerPost = 15/7;


        if (statisticsMock.usersNames().size() == 0) {
            avePostsPerUser  = 0;
            aveCommentsPerUser = 0;
        }

        statisticsListCommentsMoreThanPosts.add(avePostsPerUser);
        statisticsListCommentsMoreThanPosts.add(aveCommentsPerUser);
        statisticsListCommentsMoreThanPosts.add(aveCommentsPerPost);

        //When
        ArrayList<Double> listCommentsMoreThanPosts = statisticsCalculator.calculateAdvStatistics().size();

        //Then
        Assert.assertEquals(3, listCommentsMoreThanPosts);
    }
    @Test
    public void testCalculateAdvStatistics0Users() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator(statisticsMock);

        ArrayList<Double> statisticsList0Users = new ArrayList<Double>();
        double avePostsPerUser = 7/0;
        double aveCommentsPerUser = 15 /0;
        double aveCommentsPerPost = 15/7;


        if (statisticsMock.usersNames().size() == 0) {
            avePostsPerUser  = 0;
            aveCommentsPerUser = 0;
        }

        statisticsList0Users.add(avePostsPerUser);
        statisticsList0Users.add(aveCommentsPerUser);
        statisticsList0Users.add(aveCommentsPerPost);

        //When
        ArrayList<Double> list0Users = statisticsCalculator.calculateAdvStatistics().size();

        //Then
        Assert.assertEquals(3, list0Users);
    }
    @Test
    public void testCalculateAdvStatistics100Users() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator(statisticsMock);

        ArrayList<Double> statisticsList100Users = new ArrayList<Double>();
        double avePostsPerUser = 7/100;
        double aveCommentsPerUser = 15 /100;
        double aveCommentsPerPost = 15/7;


        statisticsList100Users.add(avePostsPerUser);
        statisticsList100Users.add(aveCommentsPerUser);
        statisticsList100Users.add(aveCommentsPerPost);

        //When
        ArrayList<Double> list100Users = statisticsCalculator.calculateAdvStatistics().size();

        //Then
        Assert.assertEquals(3, list100Users);
    }
}