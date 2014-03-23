package lang.tij4.reusing;

class Game {
    Game(int i) {
        System.out.println("Game ctor");
    }
}

class BoardGame extends Game {
    BoardGame(int i) {
        super(i);
        System.out.println("BoardGame ctor");
    }
}

public class Chess extends BoardGame {
    Chess() {
        super(11);
        System.out.println("Chess ctor");
    }

    public static void main(String[] args) {
        Chess x = new Chess();
    }
}
////////////////////////////////////////////////////
// <===================OUTPUT===================> //
// Game ctor                                      //
// BoardGame ctor                                 //
// Chess ctor                                     //
////////////////////////////////////////////////////
