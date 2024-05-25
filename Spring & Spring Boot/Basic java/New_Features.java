import java.util.Objects;

sealed class A permits B,C{}
non-sealed class B extends A{}
final class C extends A{}
class D extends B{}
sealed interface x permits y{}
non-sealed interface y extends x{}

// class Alien {
    private final int id;
    private final String name;

    public  Alien(int id,String name){
        this.id = id;
        this.name = name;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }


    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Alien alien = (Alien) o;
        return id == alien.id && Objects.equals(name, alien.name);
    }

    @Override
    public String toString(){
        return "Alien{"+ 
        "id=" + id + 
        ", name'" + name + 
        '\'' + 
        '}';
    }

    @Override
    public int hashCode(){
        return Objects.hash(id, name);
    }

}

record Alien(int id,String name){ }
public class New_Features {
    public static void main(String[] args) {
        // int a = 9;
        // var b = 10;
        // System.out.println(a+b);

        Alien obj = new Alien(1, "krishna");
        Alien obj1 = new Alien(1, "krishna");
        // Alien obj1 = new Alien(2, "Patidar");

        // System.out.println(obj);
        System.out.println(obj1);

    }
}
