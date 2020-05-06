package com.kodilla.rps;

import java.util.Scanner;

public class Game {
    private Player player = new Player();
    private Computer computer = new Computer();
    private Round round = new Round();
    private Scanner scanner = new Scanner(System.in);

    private boolean playerWins = false;
    private boolean computerWins = false;
    private int playerCounter = 0;
    private int computerCounter = 0;


    public void startANewGame() {
        boolean end = false;

        while (!end) {
            System.out.println("A new game!");
            player.setName();
            round.setRequiredWins();
            player.playerMoves();
            computer.computerMoves();
            whoWinsTheRound();
            System.out.println("Computer's score is " + computerCounter);
            System.out.println(player.getPlayerName() + "'s score is " + playerCounter);
            isGameOver();
            if(isGameOver()) {
                end = true;
            }
            afterTheGame();
        }
    }

    public void whoWinsTheRound() {
        if ((player.getPlayersChoice() == 1) && (computer.getComputersChoice() == 3)) {
            playerWins = true;
            playerCounter++;
            System.out.println("Rock crushes scissors");
            System.out.println(player.getPlayerName() + " has won the round!");
        } else if ((player.getPlayersChoice() == 1) && (computer.getComputersChoice() == 2)) {
            computerWins = true;
            computerCounter++;
            System.out.println("Paper covers rock");
            System.out.println("Computer has won the round!");
        } else if ((player.getPlayersChoice() == 3) && (computer.getComputersChoice() == 2)) {
            playerWins = true;
            playerCounter++;
            System.out.println("Scissors cut paper");
            System.out.println(player.getPlayerName() + " has won the round!");
        } else if ((player.getPlayersChoice() == 3) && (computer.getComputersChoice() == 1)) {
            computerWins = true;
            computerCounter++;
            System.out.println("Rock crushes scissors!");
            System.out.println("Computer has won the round!");
        } else if ((player.getPlayersChoice() == 2) && (computer.getComputersChoice() == 1)) {
            playerWins = true;
            playerCounter++;
            System.out.println("Paper covers rock");
            System.out.println(player.getPlayerName() + " has won!");
        } else if ((player.getPlayersChoice() == 2) && (computer.getComputersChoice() == 3)) {
            computerWins = true;
            computerCounter++;
            System.out.println("Scissors cut paper");
            System.out.println("Computer has won the round!");
        } else if (((player.getPlayersChoice() == 1) && (computer.getComputersChoice() == 1)) ||
                ((player.getPlayersChoice() == 2) && (computer.getComputersChoice() == 2)) ||
                ((player.getPlayersChoice() == 3) && (computer.getComputersChoice() == 3))) {
            System.out.println("It's a draw!");
        }
    }

    public boolean isGameOver() {
        if (round.getRequiredWins() == playerCounter) {
            System.out.println(player.getPlayerName() + " has won the game!");
            return true;
        } else if (round.getRequiredWins() == computerCounter) {
            System.out.println("Computer has won the game!");
            return true;
        }
        return false;
    }

    public void afterTheGame() {
        System.out.println("What would you like to do next?");
        System.out.println("Press X if you want to quit the game. Press N if you want to start a new game.");
        if (scanner.next().equals("X")) {
            System.out.println("Are you sure you want to quit the game? Press Y for yes. Press N for no");
            if (scanner.next().equals("Y")) {
                System.out.println("This is the end. Bye, bye!");
            } else if (scanner.next().equals("N")) {
                startANewGame();
            }
        }
    }
}
