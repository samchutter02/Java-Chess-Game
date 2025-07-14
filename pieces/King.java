public class King extends Piece {
    private String color;
    private Position position;
    public King(String color, Position position) {
        this.color = color;
        this.position = position;
    }
    
    @Ovverride
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
        // Implement logic for king's possible moves
        return List.of(); // Placeholder for actual implementation
    }

    @Override
    public String toString() {
        return "King{" + "color='" + color + '\'' + ", position=" + position + '}';
    }
}