package tamagotchi;

public class Alien extends Tamagotchi {
    public Alien() {
        super(10000 , "Mike" , "Angry" , 10);
    }

    @Override
    public String activity() {
        super.activity();
        return ("Alien abducts some people...");


    }
}
