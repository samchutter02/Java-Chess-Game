import java.util.ArrayList;
import java.util.List;

public class Rook extends Piece {
    public String color;
    public Position position;
    public Rook(String color, Position position) {
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
        // Implement logic for rook's possible moves
        List<Position> moves = new ArrayList<>();
        return moves;
    }
    @Override
    public String toString() {
        return "Rook{" + "color='" + color + '\'' + ", position=" + position + '}';
    }
}