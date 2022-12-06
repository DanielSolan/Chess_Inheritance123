public class King extends Piece{
    private boolean inCheck;

    public King(String position, boolean isBlack){
        super(position, isBlack);
        symbol = 'k';
        inCheck = false;
    }

    //Kings can move in one square in any direction
    public boolean isValidMove(String targetPosition){
        int column = ChessUtilities.getColumnFromPosition(targetPosition);
        int row = ChessUtilities.getRowFromPosition(targetPosition);
        return true;
    }
}
