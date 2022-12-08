public class Rook extends Piece{

    public Rook(String position, boolean isBlack){
        super(position, isBlack);
        symbol = 'r';
    }

    public boolean isValidMove(String targetPosition){
        int startRow = ChessUtilities.getRowFromPosition(getPosition());
        int startColumn = ChessUtilities.getColumnFromPosition(getPosition());
        int targetRow = ChessUtilities.getRowFromPosition(targetPosition);
        int targetColumn = ChessUtilities.getColumnFromPosition(targetPosition);
        //can't stand still
        if (targetRow == startRow && targetColumn == startColumn){
            return false;
        }
        //can't move more than one square in any direction.
        if (startRow != targetRow && startColumn!=targetColumn){
            return false;
        }
        //Otherwise we cool
        return true;

    }
}
