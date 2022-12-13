public class Main {

    public static void main(String[] args) {
        boolean quit = false;
        System.out.println("You are in chess.");

        Chess game = new Chess();
        while (quit==false){
            game.display();
            game.move();
        }
    }
}
