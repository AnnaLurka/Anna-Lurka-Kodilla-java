package com.kodilla.patterns.strategy.social;

public class User {

    final String userName;
    protected SocialPublisher socialPublisher;

    public User(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public String sharePost() {
        return socialPublisher.share();
    }

    public void setSharingMedia(SocialPublisher socialPublisher) {
        this.socialPublisher = socialPublisher;
    }
}
