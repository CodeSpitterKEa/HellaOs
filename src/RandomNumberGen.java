import java.util.Random;

public class RandomNumberGen {
    public static void main(String[] args) {

        // laver random object ligesom scanner
        Random random1 = new Random();

        // for int generere loops 1 2 3 4 og op til 10.
        for (int i = 1; i < 10; i++) {

            System.out.println(getDieRoll(random1));
        }

    }

    public static int getDieRoll(Random random) {

return random.nextInt(1,7);
    }

}
