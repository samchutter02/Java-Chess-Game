import pieces.Knight;
import pieces.Pawn;
import pieces.Queen;
import pieces.Rook; 
import pieces.Bishop;
import pieces.King;
import pieces.Piece;
import position.Position;

public class Board {
    private Piece[][] board;
    /*
     * this class represents a chess board
     * it initializes the board with pieces in their starting positions  |
     * board is an 8x8 grid of Piece objects                             v
    */

    private void initializeBoard() { // create initial board setup
        board[0][0] = new Rook("black", new Position(0,0)); // top left position
        board[0][1] = new Knight("black", new Position(0,1));
        board[0][2] = new Bishop("black", new Position(0,2));
        board[0][3] = new Queen("black", new Position(0,3));
        board[0][4] = new King("black", new Position(0,4));
        board[0][5] = new Bishop("black", new Position(0,5));
        board[0][6] = new Knight("black", new Position(0,6));
        board[0][7] = new Rook("black", new Position(0,7)); // top right position

        for(int i=0; i<8; i++){
            board[1][i] = new Pawn("black", new Position(1,i));
        }

        board[7][0] = new Rook("white", new Position(7,0)); // bottom left position
        board[7][1] = new Knight("white", new Position(7,1));
        board[7][2] = new Bishop("white", new Position(7,2));
        board[7][3] = new Queen("white", new Position(7,3));  
        board[7][4] = new King("white", new Position(7,4)); 
        board[7][5] = new Bishop("white", new Position(7,5));
        board[7][6] = new Knight("white", new Position(7,6));
        board[7][7] = new Rook("white", new Position(7,7)); // bottom right position

        for(int i=0; i<8; i++){
            board[6][i] = new Pawn("white", new Position(6,i));
        }
    }

    public Board() { // instantiate board
        board = new Piece[8][8]; //array not including labels on TL or T
        initializeBoard();
    }
    public boolean isValidPosition(int row, int col) {
    return row >= 0 && row < 8 && col >= 0 && col < 8;
}


    public Piece getPiece(Position pos){
        // FIXME

        int row = pos.getRow();
        int col = pos.getCol();
        if (row >= 0 && row < 8 && col >= 0 && col < 8) {
            return board[row][col];
        }
        return null;
    }

    public boolean movePiece(Position from, Position to) {
        // FIXME
        Piece movingPiece = getPiece(from);
        if (movingPiece == null) {
            System.out.println("No piece at that position.");
            return false;
        }
        Piece targetPiece = getPiece(to);
        if (targetPiece != null && targetPiece.getColor().equals(movingPiece.getColor())) {
            System.out.println("You can't capture your own piece.");
            return false;
        }

        board[to.getRow()][to.getCol()] = movingPiece;
        board[from.getRow()][from.getCol()] = null;
        movingPiece.setPosition(to);
        return true;
    }

    public void display(){  // display the board in console
        System.out.println();

        for(int row=0; row<8; row++) {
            System.out.print((8-row)+ " ");
            for(int col=0; col<8; col++) {
                Piece p = board[row][col];
                if(p != null){
                    System.out.print(p + " ");
                }else{
                    if((row+col)%2==0){ // basically if 0 then black square, else white square, even/odd grid
                        System.out.print("⬛"); 
                    } else {
                        System.out.print("⬜"); 
                    }
                }
            }
            System.out.println();
        }
    }
    
    public Position findKingPosition(String color) {
    for (int row = 0; row < 8; row++) {
        for (int col = 0; col < 8; col++) {
            Piece piece = board[row][col];
            if (piece instanceof King && piece.getColor().equals(color)) {
                return new Position(row, col);
            }
        }
    }
    return null; // Should never happen in a valid game
}  

}
