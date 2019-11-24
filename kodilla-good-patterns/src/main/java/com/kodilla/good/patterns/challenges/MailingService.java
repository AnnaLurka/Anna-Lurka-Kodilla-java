package com.kodilla.good.patterns.challenges;

public class MailingService implements InformationService{

    public void inform(User user){

        System.out.println("Sending an email to: " + user.getName() + " " + user.getSurname());
    }
}
