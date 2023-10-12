package main;


import game.Match;

public class Main {
    public static void main(String[] args) {
        Match match = new Match();
        UI.printBoard(match.getPieces());
    }
}