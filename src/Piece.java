public class Piece {
    protected int row;
    protected int column;
    private boolean isBlack;
    protected char symbol;

    public Piece(int row, int column, boolean isBlack) {
        this.row = row;
        this.column = column;
        this.isBlack = isBlack;
        symbol = 'x'; //Dummy symbol, shouldn't ever appear on board.
    }

    public Piece(String position, boolean isBlack){
        this.isBlack = isBlack;
        symbol = 'x';
        row = ChessUtilities.getRowFromPosition(position);
        column = ChessUtilities.getColumnFromPosition(position);


    }

    public char getSymbol(){
        if (isBlack==false){
            return Character.toUpperCase(symbol);
        }
        return Character.toLowerCase(symbol);
    }
    //Convert row and column values to chess notation, eg. 0,0 -> A1
    public String getPosition(){
        return ChessUtilities.columnToLetter(column) + ChessUtilities.rowToNumber(row);
    }

    //set a new position for a piece
    public void setPosition(String newPosition){
        row = ChessUtilities.getRowFromPosition(newPosition);
        column = ChessUtilities.getColumnFromPosition(newPosition);
    }

    public boolean isValidMove(String targetPosition){
        if (getPosition().equals(targetPosition)){
            return false;
        }
        return true;
    }

}
