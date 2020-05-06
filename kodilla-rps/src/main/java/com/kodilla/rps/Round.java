package com.kodilla.rps;

import java.util.Scanner;

public class Round {
    private int requiredWins;
    private Scanner scanner = new Scanner(System.in);

    public void setRequiredWins() {
        System.out.println("How many won rounds are required to win?");
        requiredWins = scanner.nextInt();
    }

    public int getRequiredWins() {
        return requiredWins;
    }
}
