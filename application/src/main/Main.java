package main;
import boardgame.ChessPosition;
import boardgame.Position;
import game.Match;

import java.util.Scanner;

import static boardgame.ChessPosition.chessPositionFromPosition;

public class Main {
    public static void main(String[] args) {
        Match match = new Match();
        UI.printBoard(match.getPieces());
        ChessPosition cp = new ChessPosition('a', 1);
        Position pos = cp.toPosition();
        System.out.println("");
        System.out.println(pos);
        cp = chessPositionFromPosition(pos);
        System.out.println(cp);
    }
}