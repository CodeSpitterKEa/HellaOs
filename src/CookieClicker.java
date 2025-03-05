import java.util.Scanner;

public class CookieClicker {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Hvor mange cookies skal du bruge? ");
        int input = Scanner.nextInt();

        System.out.println("Hvor meget mel skal der bruges til en cookie? ");
        int input1 = Scanner.nextInt();

        System.out.println("Du skal bruge: "+input * input1 + " gram mel"+" for at lave "+input+" Cookies");




    }
}
