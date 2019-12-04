package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticsCalculatorTestSuite {

    private List<String> generateListOfNNames(int namesQuantity) {
        List<String> resultList = new ArrayList<String>();
        for (int n = 1; n <= namesQuantity; n++) {
            String name = "name " + n;
            resultList.add(name);
        }
        return resultList;
    }

    @Test
    public void testCalculateAdvStatistics0Posts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();

        List<String> names10 = generateListOfNNames(10);

        ArrayList<Double> statisticsList0Posts = new ArrayList<Double>();
        double avePostsPerUser = 0;
        double aveCommentsPerUser = 20;
        double aveCommentsPerPost = 0;
        statisticsList0Posts.add(avePostsPerUser);
        statisticsList0Posts.add(aveCommentsPerUser);
        statisticsList0Posts.add(aveCommentsPerPost);

        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(200);
        when(statisticsMock.usersNames()).thenReturn(names10);

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

        List<String> names10 = generateListOfNNames(10);

        ArrayList<Double> statisticsList1000Posts = new ArrayList<Double>();
        double avePostsPerUser = 100.00;
        double aveCommentsPerUser = 20.00;
        double aveCommentsPerPost = 0.20;
        statisticsList1000Posts.add(avePostsPerUser);
        statisticsList1000Posts.add(aveCommentsPerUser);
        statisticsList1000Posts.add(aveCommentsPerPost);

        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(200);
        when(statisticsMock.usersNames()).thenReturn(names10);

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

        List<String> names10 = generateListOfNNames(10);

        ArrayList<Double> statisticsList0Comments = new ArrayList<Double>();
        double avePostsPerUser = 20.00;
        double aveCommentsPerUser = 0;
        double aveCommentsPerPost = 0;
        statisticsList0Comments.add(avePostsPerUser);
        statisticsList0Comments.add(aveCommentsPerUser);
        statisticsList0Comments.add(aveCommentsPerPost);

        when(statisticsMock.postsCount()).thenReturn(200);
        when(statisticsMock.commentsCount()).thenReturn(0);
        when(statisticsMock.usersNames()).thenReturn(names10);

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

        List<String> names10 = generateListOfNNames(10);

        ArrayList<Double> statisticsListCommentsLessThanPosts = new ArrayList<Double>();
        double avePostsPerUser = 20.00;
        double aveCommentsPerUser = 10.00;
        double aveCommentsPerPost = 0.50;
        statisticsListCommentsLessThanPosts.add(avePostsPerUser);
        statisticsListCommentsLessThanPosts.add(aveCommentsPerUser);
        statisticsListCommentsLessThanPosts.add(aveCommentsPerPost);

        when(statisticsMock.postsCount()).thenReturn(200);
        when(statisticsMock.commentsCount()).thenReturn(100);
        when(statisticsMock.usersNames()).thenReturn(names10);

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

        List<String> names10 = generateListOfNNames(10);

        ArrayList<Double> statisticsListCommentsMoreThanPosts = new ArrayList<Double>();
        double avePostsPerUser = 10.00;
        double aveCommentsPerUser = 20.00;
        double aveCommentsPerPost = 2.00;
        statisticsListCommentsMoreThanPosts.add(avePostsPerUser);
        statisticsListCommentsMoreThanPosts.add(aveCommentsPerUser);
        statisticsListCommentsMoreThanPosts.add(aveCommentsPerPost);

        when(statisticsMock.postsCount()).thenReturn(100);
        when(statisticsMock.commentsCount()).thenReturn(200);
        when(statisticsMock.usersNames()).thenReturn(names10);

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

        List<String> names0 = new ArrayList<String>();

        ArrayList<Double> statisticsList0Users = new ArrayList<Double>();
        double avePostsPerUser = 0;
        double aveCommentsPerUser = 0;
        double aveCommentsPerPost = 0;
        statisticsList0Users.add(avePostsPerUser);
        statisticsList0Users.add(aveCommentsPerUser);
        statisticsList0Users.add(aveCommentsPerPost);

        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(0);
        when(statisticsMock.usersNames()).thenReturn(names0);

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

        List<String> names100 = generateListOfNNames(100);

        ArrayList<Double> statisticsList100Users = new ArrayList<Double>();
        double avePostsPerUser = 1.00;
        double aveCommentsPerUser = 1.00;
        double aveCommentsPerPost = 1.00;
        statisticsList100Users.add(avePostsPerUser);
        statisticsList100Users.add(aveCommentsPerUser);
        statisticsList100Users.add(aveCommentsPerPost);

        when(statisticsMock.postsCount()).thenReturn(100);
        when(statisticsMock.commentsCount()).thenReturn(100);
        when(statisticsMock.usersNames()).thenReturn(names100);

        //When
        ArrayList<Double> list100Users = statisticsCalculator.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(statisticsList100Users, list100Users);
    }
}