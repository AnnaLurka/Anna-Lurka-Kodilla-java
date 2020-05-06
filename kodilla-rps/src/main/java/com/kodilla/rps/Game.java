package com.kodilla.rps;

import java.util.Scanner;

public class Game {
    private Player player = new Player();
    private Computer computer = new Computer();
    private Round round = new Round();
    private Scanner scanner = new Scanner(System.in);

    private int playerCounter = 0;
    private int computerCounter = 0;


    public void startANewGame() {

        System.out.println("A new game!");
        player.setName();
        round.setRequiredWins();

        boolean end = false;

        while (!end) {
            player.move();
            computer.move();
            getRoundWinner();
            System.out.println("Computer's score is " + computerCounter);
            System.out.println(player.getPlayerName() + "'s score is " + playerCounter);
            if(isGameOver()) {
                end = true;
            }
        }
        handleGameEnd();
    }

    public void getRoundWinner() {
        if ((player.getPlayersChoice() == 1) && (computer.getComputersChoice() == 3)) {
            playerCounter++;
            System.out.println("Rock crushes scissors");
            System.out.println(player.getPlayerName() + " has won the round!");
        } else if ((player.getPlayersChoice() == 1) && (computer.getComputersChoice() == 2)) {
            computerCounter++;
            System.out.println("Paper covers rock");
            System.out.println("Computer has won the round!");
        } else if ((player.getPlayersChoice() == 3) && (computer.getComputersChoice() == 2)) {
            playerCounter++;
            System.out.println("Scissors cut paper");
            System.out.println(player.getPlayerName() + " has won the round!");
        } else if ((player.getPlayersChoice() == 3) && (computer.getComputersChoice() == 1)) {
            computerCounter++;
            System.out.println("Rock crushes scissors!");
            System.out.println("Computer has won the round!");
        } else if ((player.getPlayersChoice() == 2) && (computer.getComputersChoice() == 1)) {
            playerCounter++;
            System.out.println("Paper covers rock");
            System.out.println(player.getPlayerName() + " has won!");
        } else if ((player.getPlayersChoice() == 2) && (computer.getComputersChoice() == 3)) {
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

    public void handleGameEnd() {
        System.out.println("What would you like to do next?");
        System.out.println("Press X if you want to quit the game. Press NG if you want to start a new game.");
        String result = scanner.next();
        if(result.equals("X")) {
            System.out.println("Are you sure you want to quit the game? Press Y for yes. Press N for no");
            String result1 = scanner.next();
            if(result1.equals("Y")) {
                System.out.println("This is the end. Bye, bye!");
            } else if(result1.equals("N")) {
                startANewGame();
            } else {
                System.out.println("Press Y or N.");
            }
        } else if(result.equals("NG")) {
            startANewGame();
        } else {
            System.out.println("Press Y or NG.");
        }
    }
}
