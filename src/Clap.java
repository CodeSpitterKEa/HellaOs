import java.util.Scanner;

final class Clap {
    public static void main(String[] args) {

        Scanner Scanner = new Scanner(System.in);
        System.out.println("How are you? ");
        String input = Scanner.nextLine();

        System.out.println(input.replace(" ", " clap ")+input);




    }
}
