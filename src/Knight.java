public class Knight extends Piece{

    public Knight(String position, boolean isBlack){
        super(position, isBlack);
        symbol = 'N';
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
        if (((Math.abs(startRow - targetRow)==2) && Math.abs(startColumn-targetColumn)==1) || ((Math.abs(startRow - targetRow)==1) && Math.abs(startColumn-targetColumn)==2)){
            return true;
        } else{
            return false;
        }
    }
}
