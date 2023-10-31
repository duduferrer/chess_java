package game;

import boardgame.Board;
import boardgame.Piece;

import static main.UI.ANSI_BLUE;

public class ChessPiece extends Piece {
    private Color color;
    private int moveCount;
    public ChessPiece(Board board, Color color) {
        super(board);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

}
