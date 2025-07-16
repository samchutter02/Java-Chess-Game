package pieces;
import java.util.ArrayList;
import java.util.List;

import board.Board;

public class Pawn extends Piece {
    private String color;
    private Position position;

    public Pawn(String color, Position position) {
        super(color, position);
    }

    @Override
    public List<Position> possibleMoves(Board board) {
        List<Position> moves = new ArrayList<>();
        int dir = color.equals("white") ? -1 : 1;

        int row = position.getRow();
        int col = position.getCol();

        // Basic forward move
        Position forward = new Position(row + dir, col); // here dir is either move up or down (-1 or 1)
        if (board.getPiece(forward) == null) {
            moves.add(forward);
        }
        return moves;
    }

    @Override
    public String toString() {
        return "Pawn{" + "color='" + color + '\'' + ", position=" + position + '}';
    }
}