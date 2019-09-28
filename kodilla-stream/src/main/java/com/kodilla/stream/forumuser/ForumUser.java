package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {

    private final int UserID;
    private final String userName;
    private final char gender;
    private final LocalDate dateOfBirth;
    private final int numberOfPosts;

    public ForumUser(final int userID, final String userName, final char gender, final int yearOfBirth, final int monthOfBirth, final int dayOfBirth, final int numberOfPosts) {
        this.UserID = userID;
        this.userName = userName;
        this.gender = gender;
        this.dateOfBirth = LocalDate.of(yearOfBirth, monthOfBirth,  dayOfBirth);
        this.numberOfPosts = numberOfPosts;
    }

    public int getUserID() {
        return UserID;
    }

    public String getUserName() {
        return userName;
    }

    public char getGender() {
        return gender;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "UserID=" + UserID +
                ", userName='" + userName + '\'' +
                ", gender=" + gender +
                ", dateOfBirth=" + dateOfBirth +
                ", numberOfPosts=" + numberOfPosts +
                '}';
    }
}
