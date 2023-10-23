package game.pieces;

import boardgame.Board;
import game.ChessPiece;
import game.Color;

public class King extends ChessPiece {
    public King(Board board, Color color) {
        super(board, color);
    }

    public String toString(){
        return("K");
    }
}
