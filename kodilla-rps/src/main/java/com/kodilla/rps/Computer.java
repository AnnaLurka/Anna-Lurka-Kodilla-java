package com.kodilla.rps;

import java.util.Random;

public class Computer {
    private int computersChoice;
    Random random = new Random();

    public void move() {
        computersChoice = random.nextInt(2) + 1;

        if (computersChoice == 1) {
            System.out.println("Computer has chosen rock.");
        } else if (computersChoice == 2) {
            System.out.println("Computer has chosen paper.");
        } else if (computersChoice == 3) {
            System.out.println("Computer has chosen scissors.");
        }
    }

    public int getComputersChoice() {
        return computersChoice;
    }
}
