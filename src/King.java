public class King extends Piece{
    private boolean inCheck;

    public King(String position, boolean isBlack){
        super(position, isBlack);
        symbol = 'k';
        inCheck = false;
    }

    //Kings can move in one square in any direction
    public boolean isValidMove(String targetPosition){
        int targetColumn = ChessUtilities.getColumnFromPosition(targetPosition);
        int targetRow = ChessUtilities.getRowFromPosition(targetPosition);
        if (targetColumn - column == 1 || targetRow - row == 1 ){
          return true;
        } else if (targetColumn - column == -1 || targetRow - row == -1){
          return true;
        } else{
          return false;
        }
    }
}
