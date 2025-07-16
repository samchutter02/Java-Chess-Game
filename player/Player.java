import java.util.ArrayList;
import position.Position;
import pieces.Piece;
import board.Board;

public class Player {
    private String color; // color of the player, e.g., "white" or "black"
    private ArrayList<Piece> pieces; // pieces owned by the player
    private Board board;

    public Player(String color, Board board) {
        this.color = color;
        this.board = board;
        this.pieces = new ArrayList<>();
    }

    public Position makeMove(Position from, Position to) {
        //  Check if it's the player's turn or not, throws message if is not
        if (!this.color.equals(board.getCurrentTurn())) {
            System.out.println("It's not " + this.color + "'s turn.");
            return null;
        }

        boolean success = board.movePiece(from, to); //Board performs the move

        if (success) {
            return to; //Move succeeds
        } else {
            System.out.println("Move failed.");
            return null;
        }
    }
}