import java.util.List;
import java.util.ArrayList;


public class King extends Piece {
    private String color;
    private Position position;

    public King(String color, Position position) {
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
        // Implement logic for king's possible moves
        List <Position> moves = new ArrayList<>();
        int row = position.getRow();
        int col = position.getCol();

        int[] rowDirs = {-1, -1, -1, 0, 0, 1, 1, 1};
        int[] colDirs = {-1, 0, 1, -1, 1, -1, 0, 1};

        for (int i = 0; i < 8; i++) {
            int newRow = row + rowDirs[i];
            int newCol = col + colDirs[i];

            if (board.isValidPosition(newRow, newCol)) {
                Position newPos = new Position(newRow, newCol);
                Piece pieceAtPosition = board.getPiece(newPos);

                if (pieceAtPosition == null || !pieceAtPosition.getColor().equals(getColor())) {
                    moves.add(newPos);
                }
            }
        }
        return moves;

    }

    @Override
    public String toString() {
        return "King{" + "color='" + color + '\'' + ", position=" + position + '}';
    }
}