import java.util.ArrayList;

public class Rook extends Piece{
    private boolean hasCastled;

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
        if(super.isValidMove(targetPosition)==false){
            return false;
        }
        //can't move more than one square in any direction.
        if (startRow != targetRow && startColumn!=targetColumn){
            return false;
        }
        //Otherwise, we cool
        return true;

    }

    //returns a list of all positions the pieces moves through, excluding start (and end)
    public ArrayList<String> passesThrough(String targetPosition){
        int startRow = ChessUtilities.getRowFromPosition(getPosition());
        int startColumn = ChessUtilities.getColumnFromPosition(getPosition());
        int targetRow = ChessUtilities.getRowFromPosition(targetPosition);
        int targetColumn = ChessUtilities.getColumnFromPosition(targetPosition);

        ArrayList<String> squares = new ArrayList<>();
        if (isValidMove(targetPosition)){
            int row = startRow+1;
            do{
                int col = startColumn+1;
                do{
                    squares.add(ChessUtilities.getPositionFromCoords(row, col));
                    col++;

                }while (col<targetColumn);

                row++;

            } while(row<targetRow);


        }
        return squares;

    }
}
