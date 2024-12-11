package Games;

public class GameRunner{
    GamingConsole game;
    GameRunner(GamingConsole game ){
        this.game = game;
    }
    public void run(){
        System.out.println(game);
        game.Down();
        game.Up();
        game.Left();
        game.Right();
    }
}
