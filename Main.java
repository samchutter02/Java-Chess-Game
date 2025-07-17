import board.Board;
import pieces.*;
import player.Player;
import position.Position;

public class Main {
    public static void main(String[] args) {
        // Create a board
        Board board = new Board();

        // Create new players
        Player whitePlayer = new Player("white", board);
        Player blackPlayer = new Player("black", board);

        // demo to see if it works
        board.setPiece(new Pawn("white", new Position(6, 4)));
        board.setPiece(new Pawn("black", new Position(1, 4)));
        board.setPiece(new Bishop("white", new Position(7, 2)));
        board.setPiece(new Knight("black", new Position(0, 1)));

        System.out.println("Initial Board:");
        board.display();
    }
}
