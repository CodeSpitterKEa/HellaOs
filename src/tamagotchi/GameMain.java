package tamagotchi;

import java.util.Scanner;

public class GameMain {

    public static void main() {
        Tamagotchi tamagotchi = new Tamagotchi();
        Scanner scanner = new Scanner(System.in);
        startGame(scanner);

    }

    public static void startGame(Scanner scanner) {
        System.out.println("Hello, pick your first pet");
        System.out.println("Dragon 1         Alien 2");
        System.out.println("░▄▄▄▄░           ▒▒▄▀▀▀▀▀▄▒▒▒▒▒▄▄▄▄▄▒▒▒");
        System.out.println("▀▀▄██►           ▒▐░▄░░░▄░▌▒▒▄█▄█▄█▄█▄▒");
        System.out.println("▀▀███►           ▒▐░▀▀░▀▀░▌▒▒▒▒▒░░░▒▒▒▒");
        System.out.println("░▀███►░█►        ▒▒▀▄░═░▄▀▒▒▒▒▒▒░░░▒▒▒▒");
        System.out.println("▒▄████▀▀         ▒▒▐░▀▄▀░▌▒▒▒▒▒▒░░░▒▒▒▒");

        String input = scanner.nextLine();
        String inputName = scanner.nextLine();
        String dragon = "1";
        String alien = "2";
        boolean Dragon = input.equals(dragon);
        boolean Alien = input.equals(alien);



        while(true) {

            if (Dragon) {
                System.out.println("You have picked your Dragon");
                System.out.println("");
                System.out.println("What name do u wanna give it?");
                Tamagotchi
            }
            if (Alien) {
                System.out.println("You have picked the Alien");
            }
            else {
                System.out.println("Pick correctly");
                break;
            }
        }




    }

}
