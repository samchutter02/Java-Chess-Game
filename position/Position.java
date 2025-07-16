package position;

public class Position{
    private int row;
    private int col;

    public Position(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public int getRow() {
        return row;
    }
    public int getCol() {
        return col;
    }

    @Override
    public boolean equals(Object start) {
        if (this == start) {
            return true;
        }
        if (!(start instanceof Position)) {
            return false;
        }
        Position other = (Position) start;
        return row == other.row && col == other.col;
    }

    @Override
    public String toString() {
        return "(" + row + ", " + col + ")";
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + col;
        result = prime * result + row;
        return result;
    }
    

}