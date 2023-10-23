package game;

import boardgame.Board;
import boardgame.Position;
import game.pieces.Rook;

public class Match {
    private int turn;
    private Color playerColor;
    private Board board;

    public Match(){
        board  = new Board(8,8);
        initialSetup();
    }

    public ChessPiece[][] getPieces(){
        ChessPiece[][] pieces = new ChessPiece[board.getRows()][board.getCols()];
        for(int i=0;i< board.getRows();i++){
            for(int j=0; j< board.getCols(); j++){
                pieces[i][j] = (ChessPiece) board.getPiece(i,j);
            }
        }
        return pieces;
    }
    private void initialSetup(){
        board.placePiece(new Rook(board, Color.WHITE), new Position(0,2));
    }

}
