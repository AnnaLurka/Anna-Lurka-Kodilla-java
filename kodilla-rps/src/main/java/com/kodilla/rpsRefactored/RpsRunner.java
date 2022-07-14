package com.kodilla.rpsRefactored;

public class RpsRunner {
    public static void main(String[] args) {
        RpsGame game = new RpsGame();
        game.greetPlayer();
        game.determineWinsToEndGame();
        game.startNewGame();
    }
}