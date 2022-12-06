public class ChessUtilities {

    //For a positionA8, return row number 7.
    public static int getRowFromPosition(String p){
        char posChar = p.toCharArray()[1]; //"A8" goes to '8'.
        int rowNumber = Character.getNumericValue(posChar); // '8' goes to 8.
        return rowNumber-1;
    }

    //For position A8, return 0.
    public static int getColumnFromPosition(String p){
        char colChar = p.toCharArray()[0]; //"A8" goes to 'A'
        int asciiValue = colChar;
        int colNumber = asciiValue - (int)'A'; //'A' goes to 0.
        return colNumber;
    }

    //eg. 0 to A, 1 to B, etc.
    public static String columnToLetter(int c){
        char letter = (char)('A' + c);
        return Character.toString(letter);
    }

    //eg. 0 -> "1", 2 -> "3"
    public static String rowToNumber(int r){
        return Integer.toString(r+1);
    }
}
