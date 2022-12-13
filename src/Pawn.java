public class Pawn extends Piece{
    private boolean hasMoved=false;

    public Pawn(String position, boolean isBlack){
        super(position, isBlack);
        symbol = 'p';
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
        if(hasMoved == false){
            if(Math.abs(targetColumn- startColumn) == 2 || Math.abs(targetColumn- startColumn) == 1){
                return true;
            } else{
                return false;
            }
        } else{
            if(Math.abs(targetColumn- startColumn)==1){
                return true;
            } else{
                return false;
            }
        }

        //Otherwise we cool

    }
}
