package boardgame;

import boardgame.exceptions.ChessException;

public class ChessPosition {

    private char col;
    private int row;

    public ChessPosition(char col, int row){
        if(col<'a' || col>'h' || row<1 || row>8){
            throw new ChessException("Position invalid! Select a position between A1 and H8");
        };
        this.row = row;
        this.col  = col;
    }
    private int colConvert(char col){
        return col - 'a';
    }
    private int rowConvert(int row){
        return 8 - row;
    }

    public Position toPosition(){
        int positionCol = colConvert(col);
        int positionRow = rowConvert(row);
        return new Position(positionRow, positionCol);
    }

    private static char convertColIntToChar(int col){
        return (char)(col+97); //97 is char 'a' in ASCII table
    }
    public static ChessPosition chessPositionFromPosition(Position position){
        char col =  convertColIntToChar(position.getCol());
        int row = 8 - position.getRow();
        return new ChessPosition(col, row);
    }
    @Override
    public String toString(){
        return ""+col+row;
    }

}