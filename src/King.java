public class King extends Piece{
    private boolean inCheck;

    public King(String position, boolean isBlack){
        super(position, isBlack);
        symbol = 'k';
        inCheck = false;
    }

    //Kings can move in one square in any direction
    //public boolean isValidMove(String targetPosition){
        //int targetColumn = ChessUtilities.getColumnFromPosition(targetPosition);
        //int targetRow = ChessUtilities.getRowFromPosition(targetPosition);
       // if (targetColumn - column == 1 || targetRow - row == 1 ){
          //return true;
        //} else if (targetColumn - column == -1 || targetRow - row == -1){
         // return true;
        //} else{
          //return false;
        //}
    //}

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
        if (Math.abs(startRow - targetRow)>1){
            return false;
        }
        if (Math.abs(startColumn - targetColumn)>1){
            return false;
        }
        //Otherwise we cool
        return true;

    }
}
