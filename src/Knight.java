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
        int rowDifference = Math.abs(startRow - targetRow);
        int columnDifference = Math.abs(startColumn-targetColumn);
        if(super.isValidMove(targetPosition)==false){
            return false;
        }
        if (((rowDifference==2) && columnDifference==1) || ((rowDifference==1) && columnDifference==2)){
            return true;
        } else{
            return false;
        }
    }
}
