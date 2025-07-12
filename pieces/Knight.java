public class Knight extends Piece{
    private String color;
    private Position position;

    public Knight(String color, Position position) {
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

    @Override
    public void setPosition(Position position) {
        this.position = position;
    }

    @Override
    public List<Position> possibleMoves(Board board) {
        // Implement logic for knight's possible moves
        return List.of(); // Placeholder for actual implementation
    }

    @Override
    public String toString() {
        return "Knight{" + "color='" + color + '\'' + ", position=" + position + '}';
    }
}