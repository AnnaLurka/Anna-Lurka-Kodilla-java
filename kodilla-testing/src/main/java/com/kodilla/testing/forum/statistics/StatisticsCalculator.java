package com.kodilla.testing.forum.statistics;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class StatisticsCalculator {


    public ArrayList<Double> calculateAdvStatistics(Statistics statistics) {

        ArrayList<Double> resultList = new ArrayList<Double>();

        double numberOfUsers = (double) statistics.usersNames().size();
        double postsCount = (double) statistics.postsCount();
        double commentsCount = (double) statistics.commentsCount();

        double avePostsPerUser;
        double aveCommentsPerUser;
        double aveCommentsPerPost;

        if (numberOfUsers != 0) {

            avePostsPerUser = postsCount / numberOfUsers;
            aveCommentsPerUser = commentsCount / numberOfUsers;

        } else {

            avePostsPerUser = 0;
            aveCommentsPerUser = 0;
        }

        if (postsCount != 0) {

            aveCommentsPerPost = commentsCount / postsCount;

        } else {

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