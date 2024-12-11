package Games;

public class Cannon implements GamingConsole{
    @Override
    public void Up() {
        System.out.println("Up");
    }

    @Override
    public void Down() {
        System.out.println("Down");
    }

    @Override
    public void Left(){
        System.out.println("Go back");
    }

    @Override
    public void Right(){
        System.out.println("foreword");
    }
}
