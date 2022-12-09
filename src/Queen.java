public class Queen extends Piece{

    public Queen(String position, boolean isBlack){
        super(position, isBlack);
        symbol = 'Q';
    }

    public boolean isValidMove(String targetPosition) {
        int startRow = ChessUtilities.getRowFromPosition(getPosition());
        int startColumn = ChessUtilities.getColumnFromPosition(getPosition());
        int targetRow = ChessUtilities.getRowFromPosition(targetPosition);
        int targetColumn = ChessUtilities.getColumnFromPosition(targetPosition);
        //can't stand still
        if (targetRow == startRow && targetColumn == startColumn) {
            return false;
        }
        if (targetRow == startRow || targetColumn == startColumn){
            if (startRow != targetRow && startColumn!=targetColumn){
                return false;
            }
        }else{
            if (Math.abs(startRow - targetRow) != Math.abs(startColumn-targetColumn)){
                return false;
            }
        }
        return true;
    }
}