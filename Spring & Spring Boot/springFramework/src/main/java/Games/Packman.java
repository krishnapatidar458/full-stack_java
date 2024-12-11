package Games;

public class Packman implements GamingConsole{
    @Override
    public void Up() {
        System.out.println("Jump");
    }

    @Override
    public void Down() {
        System.out.println("Seat");
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
