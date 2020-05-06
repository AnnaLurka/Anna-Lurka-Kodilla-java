package com.kodilla.rps;

import java.util.Scanner;

public class Player {

    private int playersChoice;
    private String playerName;
    private Scanner scanner = new Scanner(System.in);


    public void setName() {
        System.out.println("What's your name?");
        boolean longEnough = false;

        while(!longEnough) {
        playerName = scanner.next();
            if(playerName.length() >= 3) {
                longEnough = true;
            } else {
                System.out.println("Your name is too short");
            }
        }
    }

    public void move() {
        System.out.println("Make your move.");
        System.out.println("Press 1 to choose rock.");
        System.out.println("Press 2 to choose paper.");
        System.out.println("Press 3 to choose scissors.");

        playersChoice = scanner.nextInt();
        if(playersChoice == 1) {
            System.out.println(getPlayerName() + " has chosen rock.");
        } else if(playersChoice == 2) {
            System.out.println(getPlayerName() + " has chosen paper.");
        } else if(playersChoice == 3) {
            System.out.println(getPlayerName() + " has chosen scissors.");
        } else {
            System.out.println("Wrong number!");
        }
    }

    public int getPlayersChoice() {
        return playersChoice;
    }

    public String getPlayerName() {
        return playerName;
    }
}
