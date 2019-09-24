package com.kodilla.testing.forum.statistics;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class StatisticsCalculator{


    public ArrayList<Double> calculateAdvStatistics(Statistics statistics){

        ArrayList<Double> resultList = new ArrayList<Double>();

        double numberOfUsers = statistics.usersNames().size();
        double postsCount = statistics.postsCount();
        double commentsCount = statistics.commentsCount();

        double avePostsPerUser = postsCount/numberOfUsers;
        double aveCommentsPerUser = commentsCount/numberOfUsers;
        double aveCommentsPerPost = commentsCount/postsCount;

        if (numberOfUsers == 0) {
            avePostsPerUser  = 0;
              aveCommentsPerUser = 0;
        }

        if (postsCount == 0) {
            aveCommentsPerPost = 0;
        }


        resultList.add(avePostsPerUser);
        resultList.add(aveCommentsPerUser);
        resultList.add(aveCommentsPerPost);

        return resultList;
    }

    public void showStatistics(ArrayList<Double> resultList) {

        System.out.println(resultList);
    }
}