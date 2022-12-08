public class Main {

    public static void main(String[] args) {
        boolean quit = false;
        System.out.println("You are in chess.");
        Piece test = new Piece(0,0, true);
        System.out.println(test.getPosition() + " is " + test.getSymbol());
        test = new Piece("C3", false);
        System.out.println(test.getPosition() + " is " + test.getSymbol());

        Chess game = new Chess();
        while (quit==false){
            game.display();
            game.move();
        }
    }
}
