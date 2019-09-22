package com.kodilla.testing.forum.statistics;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class StatisticsCalculator{

    Statistics statistics;

    public StatisticsCalculator(Statistics statistics) {
        this.statistics = statistics;
    }

    public ArrayList<Statistics> calculateAdvStatistics(Statistics statistics){

        ArrayList<Statistics> resultList = new ArrayList<Statistics>();

        int numberOfUsers = statistics.usersNames().size();
        int postsCount = statistics.postsCount();
        int commentsCount = statistics.commentsCount();
        double avePostsPerUser = postsCount/numberOfUsers;
        double aveCommentsPerUser = commentsCount/numberOfUsers;
        double aveCommentsPerPost = commentsCount/postsCount;


        resultList.add(numberOfUsers);
        resultList.add(postsCount);
        resultList.add(commentsCount);
        resultList.add(avePostsPerUser);
        resultList.add(aveCommentsPerUser);
        resultList.add(aveCommentsPerPost);

        return resultList;
    }

    public void showStatistics(){

        System.out.println(resultList);
    }
}