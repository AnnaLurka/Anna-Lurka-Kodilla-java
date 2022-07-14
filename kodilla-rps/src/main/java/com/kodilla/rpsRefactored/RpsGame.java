package com.kodilla.rpsRefactored;

import java.util.Random;
import java.util.Scanner;

public class RpsGame {
    private static int ROCK = 1;
    private static int PAPPER = 2;
    private static int SCISSORS = 3;
    private int wins;
    private boolean end = false;
    Player person = new Player();
    Player computer = new Player("Computer");
    Scanner scanner = new Scanner(System.in);
    int playersChoiceInt;
    String playersChoiceString;
    int computersChoice;

    public void greetPlayer() {
        System.out.println("What's your name?");
        String name = scanner.nextLine();
        System.out.println("Hello " + name + "!");
        person.setName(name);
    }

    public void determineWinsToEndGame() {
        System.out.println("How many wins to end the game?");
        try {
            wins = scanner.nextInt();
            System.out.println("The first player to win " + wins
                    + (wins == 1 ? " round" : " rounds") + " is the winner of the game!");
            System.out.println();
        } catch (NumberFormatException nfe) {
            System.out.println("Invalid character. Choose a number.");
        }
    }

    public void showGameOptions() {
        System.out.println("Press:");
        System.out.println("1 for rock.");
        System.out.println("2 for paper.");
        System.out.println("3 for scissors.");
        System.out.println("x to end the game.");
        System.out.println("n to restart the game.");
    }

    public void playerMoves() {
        System.out.println("Make your move...");
        if (scanner.hasNextInt()) {
            playersChoiceInt = scanner.nextInt();
            switch(playersChoiceInt) {
                case 1:
                    System.out.println("You have chosen rock.");
                    break;
                case 2:
                    System.out.println("You have chosen paper.");
                    break;
                case 3:
                    System.out.println("You have chosen scissors.");
                    break;
                default:
                    System.out.println("Invalid number. Enter 1, 2 or 3.");
                    playerMoves();
            }
        } else {
            playersChoiceString = scanner.next();
            switch (playersChoiceString) {
                case "x":
                    System.out.println("Are you sure you want to end the game?");
                    System.out.println("Press: \"y\" for YES and \"n\" for NO.");
                    String ifGameEnds = scanner.next();
                    if (ifGameEnds.equals("y")) {
                        System.out.println("The end!");
                        end = true;
                        break;
                    } else {
                        System.out.println("Continue!");
                        playerMoves();
                        break;
                    }
                case "n":
                    System.out.println("Are you sure you want to end the current game and start a new one?");
                    System.out.println("Press: \"y\" for YES and \"n\" for NO.");
                    String ifNewGame = scanner.next();
                    if (ifNewGame.equals("y")) {
                        System.out.println("A new game!");
                        startNewGame();
                    } else {
                        System.out.println("Continue!");
                        playerMoves();
                    }
                    break;
                default:
                    System.out.println("Invalid character.There is no such an option. Try again!");
            }
        }
    }

    public void computerMoves() {
        Random random = new Random();
        computersChoice = random.nextInt(3) + 1;
        switch (computersChoice) {
            case 1:
                System.out.println("Computer has chosen rock.");
                break;
            case 2:
                System.out.println("Computer has chosen paper.");
                break;
            case 3:
                System.out.println("Computer has chosen scissors.");
                break;
        }
    }

    public void getRoundWinner() {
        if ((playersChoiceInt == ROCK && computersChoice == ROCK)
                || (playersChoiceInt == PAPPER && computersChoice == PAPPER)
                || (playersChoiceInt == SCISSORS && computersChoice == SCISSORS)) {
            System.out.println("It's a draw! Please continue...");
        } else if (playersChoiceInt == ROCK && computersChoice == PAPPER) {
            System.out.println("Paper beats rock. The computer wins the round!");
            computer.score();
        } else if (playersChoiceInt == ROCK && computersChoice == SCISSORS) {
            System.out.println("Rock beats scissors. The player wins the round!");
            person.score();
        } else if (playersChoiceInt == PAPPER && computersChoice == ROCK) {
            System.out.println("Paper beats rock. The player wins the round!");
            person.score();
        } else if (playersChoiceInt == PAPPER && computersChoice == SCISSORS) {
            System.out.println("Scissors cut paper. The computer wins the round!");
            computer.score();
        } else if (playersChoiceInt == SCISSORS && computersChoice == ROCK) {
            System.out.println("Rock beats scissors. The computer wins the round!");
            computer.score();
        } else if (playersChoiceInt == SCISSORS && computersChoice == PAPPER) {
            System.out.println("Scissors beat paper. The player wins the round!");
            person.score();
        }
    }

    public void getWins() {
        System.out.println("Your score is " + person.getScore() + "."
                + "\nThe computer's score is " + computer.getScore());
    }

    public void startNewGame() {
        showGameOptions();

        while (!end) {
            playerMoves();
            if(!end) {
                computerMoves();
                getRoundWinner();
                getWins();
                if (gameOver())
                    end = true;
            }
        }
    }

    public boolean gameOver() {
        if(person.getScore() == wins) {
            System.out.println("You win the game!");
            return true;
        } else if (computer.getScore() == wins) {
            System.out.println("The computer wins the game!");
            return true;
        }
        return false;
    }
}