package Games;

public class StartGames {
    public static void main(String[] args) {
//        var game = new Packman();
        var game = new Cannon();
        var gameRunner = new GameRunner(game);

        gameRunner.run();
    }
}
