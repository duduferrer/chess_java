package boardgame;

import boardgame.exceptions.BoardException;

public class Board {
    private int rows;
    private int cols;
    private Piece[][] pieces;

    public Board(int rows, int cols) throws BoardException {
        if (rows<1 || cols <1){
            throw new BoardException("Board must have more than 1 line and column");
        }
        this.rows = rows;
        this.cols = cols;
        pieces = new Piece[rows][cols];
    }

    public int getRows() {
        return rows;
    }

    public int getCols() {
        return cols;
    }

    public Piece getPiece(int row, int col){
        if (!positionExists(row, col)){
            throw new BoardException("Position is not on the board.");
        }
        return pieces[row][col];
    }
    public Piece getPiece(Position position){
        if (!positionExists(position)){
            throw new BoardException("Position is not on the board.");
        }
        return pieces[position.getRow()][position.getCol()];
    }

    public void placePiece(Piece piece, Position position){
        if(thereIsAPiece(position)){
            throw new BoardException("There is a piece in position " + position);
        }
        pieces[position.getRow()][position.getCol()] = piece;
        piece.position = position;
    }

    private boolean thereIsAPiece(Position position){
        return getPiece(position)!=null && positionExists(position);
    }

    private boolean positionExists(int row, int col){
        return row >= 0 && col >= 0 && row <= rows && col <= cols;
    }
    private boolean positionExists(Position position){
        return positionExists(position.getRow(), position.getCol());
    }

}
