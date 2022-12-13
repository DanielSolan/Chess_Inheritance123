public class Bishop extends Piece{

    public Bishop(String position, boolean isBlack){
        super(position, isBlack);
        symbol = 'b';
    }

    public boolean isValidMove(String targetPosition){
        int startRow = ChessUtilities.getRowFromPosition(getPosition());
        int startColumn = ChessUtilities.getColumnFromPosition(getPosition());
        int targetRow = ChessUtilities.getRowFromPosition(targetPosition);
        int targetColumn = ChessUtilities.getColumnFromPosition(targetPosition);
        //can't stand still
        if(super.isValidMove(targetPosition)==false){
            return false;
        }
        //can't move more than one square in any direction.
        if (Math.abs(startRow - targetRow) != Math.abs(startColumn-targetColumn)){
            return false;
        }
        //Otherwise we cool
        return true;

    }
}
