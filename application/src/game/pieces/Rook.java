package game.pieces;

import boardgame.Board;
import game.ChessPiece;
import game.Color;

public class Rook extends ChessPiece {
    public Rook (Board board, Color color){
        super(board, color);
    }
    @Override
    public String toString(){
        return("R");
    }
}
