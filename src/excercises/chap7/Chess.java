package excercises.chap7;

class Game {
    Game(int i) {
        System.out.println("Game constructor " + i);
    }
}

class BoardGame extends Game {
    BoardGame(String s) {
        super(s.length());
        System.out.println("BoardGame constructor. " + s);
    }
}

public class Chess extends BoardGame {
    private Chess() {
        super("a message from Chess");
        System.out.println("Chess constructor");
    }

    public static void main(String[] args) {
        Chess chess = new Chess();
    }
}
