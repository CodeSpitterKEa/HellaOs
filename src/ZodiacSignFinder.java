import java.util.Scanner;

public class ZodiacSignFinder {
    public static void main(String[] args) {

        Scanner Scanner = new Scanner(System.in);
        System.out.println("Hvad for en måned er du fød i 1-12? ");
        int month = Scanner.nextInt();

        System.out.println("Hvad for en dag på måneden er du født 1-31? ");
        int day = Scanner.nextInt();



            if (month == (1)) {

            if (day <= (20)) {
                System.out.println("Stenbukken");
            } else {
                System.out.println("Vandmanden");
            }
        }



    }
}
