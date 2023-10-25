package boardgame.exceptions;

import java.io.Serial;

public class BoardException extends RuntimeException{
    @Serial
    private static final long serialVersionUID;

    static {
        serialVersionUID = -8081742046206666947L;
    }

    public BoardException(String msg){
        super(msg);
    }
}
