import java.util.ArrayList;
import java.util.List;

public class Queen extends Piece {
    private String color;
    private Position position;
    public Queen(String color, Position position) {
        this.color = color;
        this.position = position;
    }

    @Override
    public String getColor() {
        return color;
    }
    @Override
    public Position getPosition() {
        return position;
    }
    // set position 
    @Override
    public void setPosition(Position position) {
        this.position = position;
    }
    @Override
    public List<Position> possibleMoves(Board board) {
        // Implement logic for queen's possible moves
        List<Position> moves = new ArrayList<>();
        return moves;
    }
    @Override
    public String toString() {
        return "Queen{" + "color='" + color + '\'' + ", position=" + position + '}';
    }
}