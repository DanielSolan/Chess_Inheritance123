import java.util.ArrayList;
import java.util.Scanner;

public class Chess {
    private Piece[][] board;

    // Set up the board for the start of the game.
    public Chess(){
        board = new Piece[8][8];
        //create the pawns
        board[1][0] = new Pawn("A2", false);
        board[1][1] = new Pawn("B2", false);
        board[1][2] = new Pawn("C2", false);
        board[1][3] = new Pawn("D2", false);
        board[1][4] = new Pawn("E2", false);
        board[1][5] = new Pawn("F2", false);
        board[1][6] = new Pawn("G2", false);
        board[1][7] = new Pawn("H2", false);
        board[6][0] = new Pawn("A7", true);
        board[6][1] = new Pawn("B7", true);
        board[6][2] = new Pawn("C7", true);
        board[6][3] = new Pawn("D7", true);
        board[6][4] = new Pawn("E7", true);
        board[6][5] = new Pawn("F7", true);
        board[6][6] = new Pawn("G7", true);
        board[6][7] = new Pawn("H7", true);


        for (int b = 0; b<8; b++){
            if (b==0){
                board[b][4] = new King("E1", false);
            } else if (b==7){
                board[b][4] = new King("E7", true);
            }
        }

        board[0][0] = new Rook("A1", false);
        board[0][7] = new Rook("H1", false);
        board[0][1] = new Knight("B1", false);
        board[0][6] = new Knight("G1", false);
        board[0][2] = new Bishop("A1", false);
        board[0][5] = new Bishop("H1", false);
        board[0][3] = new Queen("D1", false);

        board[7][0] = new Rook("A8", true);
        board[7][7] = new Rook("H8", true);
        board[7][1] = new Knight("B8", true);
        board[7][6] = new Knight("G8", true);
        board[7][2] = new Bishop("A8", true);
        board[7][5] = new Bishop("H8", true);
        board[7][3] = new Queen("D7", true);

    }

    //print the current board layout.
    public void display(){
        for (int r = 0; r<8; r++){
            System.out.print("                                                                  ");
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

    //Takes chess coords, e.g. A8, and returns the piece at that location or null
    public Piece getPieceAt(String position){
        int row = ChessUtilities.getRowFromPosition(position);
        int column = ChessUtilities.getColumnFromPosition(position);
        return board[row][column];
    }

    //take input from user for a chess move and validate
    public void move(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the piece to move: ");
        String startPosition = input.nextLine();
        System.out.println("Enter the square to move to: ");
        String endPosition = input.nextLine();
        Piece toMove = getPieceAt(startPosition);
        boolean validMove = false;
        if (toMove != null){
            validMove = toMove.isValidMove(endPosition);
        }
        if (validMove){
            //check there are no pieces in the way

            ArrayList<String> squares = toMove.passesThrough(endPosition);
            System.out.println(toMove.getSymbol() + " moves to " + endPosition);
            int startRow = ChessUtilities.getRowFromPosition(startPosition);
            int startColumn = ChessUtilities.getColumnFromPosition(startPosition);
            int targetRow = ChessUtilities.getRowFromPosition(endPosition);
            int targetColumn = ChessUtilities.getColumnFromPosition(endPosition);
            board[targetRow][targetColumn] = board[startRow][startColumn];
            board[startRow][startColumn] = null;
        } else{
            System.out.println("You cannot do that");
        }
    }
}
