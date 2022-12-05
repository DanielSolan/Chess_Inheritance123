public class Chess {
    private Piece[][] board;

    // Set up the board for the start of the game.
    public Chess(){
        board = new Piece[8][8];
        //create the pawns
        for (int c = 0; c<8; c++){
            board[1][c]= new Piece(1, c, false);
            board[6][c] = new Piece(6, c, true);
        }
    }

    //print the current board layout.

    public void display(){
        for (int r = 0; r<8; r++){
            for (int c=0; c<8; c++){
                if (board[r][c] != null){
                    System.out.print(board[r][c].getSymbol() + " ");
                } else{
                    System.out.print("  "); //Blank square
                }
            }
            System.out.println(); //Start a new row.
        }
    }
}
