import java.util.Scanner;

public class Tommeberegner {
    public static void main(String[] args) {

        Scanner Scanner = new Scanner(System.in);

        System.out.println("Velkommen til tommeberegneren ...");

        double Cm = 2.54;


        System.out.println("Hvor mange tommer skal du bruge? ");
        double tommer = Scanner.nextDouble();

        System.out.println("Dine tommer er: "+tommer*Cm+" Cm");





    }
}
