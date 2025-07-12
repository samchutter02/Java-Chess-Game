package pieces;

import position.Position;
import board.Board;
import java.util.List;
import java.util.List;
import board.Board;

public class Piece {
    /*
     * Add methods here
     */
    
    
    public void piece(String color, Position position) { // constructor 

    }

    public String getColor() {
        // code to return color
    }

    public Position getPosition() {
        // code to return position
    }

    public void setPosition(Position position) {
        // code to set position
    }
    
    public abstract List<Position> possibleMoves(Board board);

    public abstract String toString();
}