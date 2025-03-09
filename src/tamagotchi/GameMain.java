package tamagotchi;

import java.util.Scanner;

public class GameMain {

    public static void main() {
        Dragon dragon1 = new Dragon();
        Alien alien1 = new Alien();
        Scanner scanner = new Scanner(System.in);
        startGame(scanner, dragon1, alien1);



    }

    public static void startGame(Scanner scanner, Dragon dragon1, Alien alien1) {
        System.out.println("Hello, pick your first pet");
        System.out.println("Dragon 1         Alien 2");
        System.out.println("░▄▄▄▄░           ▒▒▄▀▀▀▀▀▄▒▒▒▒▒▄▄▄▄▄▒▒▒");
        System.out.println("▀▀▄██►           ▒▐░▄░░░▄░▌▒▒▄█▄█▄█▄█▄▒");
        System.out.println("▀▀███►           ▒▐░▀▀░▀▀░▌▒▒▒▒▒░░░▒▒▒▒");
        System.out.println("░▀███►░█►        ▒▒▀▄░═░▄▀▒▒▒▒▒▒░░░▒▒▒▒");
        System.out.println("▒▄████▀▀         ▒▒▐░▀▄▀░▌▒▒▒▒▒▒░░░▒▒▒▒");



        while (true) {

            String input = scanner.nextLine();
            String dragonPet = "1";
            String alienPet = "2";


            boolean DragonPet = input.equals(dragonPet);
            boolean AlienPet = input.equals(alienPet);


            if (DragonPet) {
                System.out.println("You have picked your Dragon named: " + dragon1.getName());
                System.out.println("");
                DragonPet1(scanner, dragon1, alien1);

            }

            if (AlienPet) {

                System.out.println("You have picked your Alien named: " + alien1.getName());
                System.out.println("");
                AlienPet1(scanner, dragon1, alien1);

            }

        }
    }

    public static void DragonPet1(Scanner scanner, Dragon dragon1, Alien alien1) {

        while(true) {


            String play = "3";
            String feed = "4";
            String sleep = "5";
            String quit = "6";



            System.out.println("What would you like " + dragon1.getName() + " to do?");
            System.out.println(" 3 - play");
            System.out.println(" 4 - feed");
            System.out.println(" 5 - sleep");
            System.out.println(" 6 - Quit game");

            String choice = scanner.nextLine();

            boolean Sleep = choice.equals(sleep);
            boolean Play = choice.equals(play);
            boolean Feed = choice.equals(feed);
            boolean Quit = choice.equals(quit);



            if (Play) {
                System.out.println(dragon1.activity());
                System.out.println("Eminem's energy is: " + dragon1.getEnergy());
            }
            if (Feed) {
                System.out.println(dragon1.feed() + "Energy is replenished to " + dragon1.getEnergy());
            }
            if (Sleep) {
                System.out.println(dragon1.sleep() + dragon1.getEnergy() + " Energy");
            }
            if (Quit) {
                System.out.println("Exiting game...");
                break;
            }
        }

    }

    public static void AlienPet1(Scanner scanner, Dragon dragon1, Alien alien1) {

        while(true) {

            String play = "3";
            String feed = "4";
            String sleep = "5";
            String quit = "6";



            System.out.println("What would you like " + alien1.getName() + " to do?");
            System.out.println(" 3 - play");
            System.out.println(" 4 - feed");
            System.out.println(" 5 - sleep");
            System.out.println(" 6 - Quit game");

            String choice = scanner.nextLine();

            boolean Sleep = choice.equals(sleep);
            boolean Play = choice.equals(play);
            boolean Feed = choice.equals(feed);
            boolean Quit = choice.equals(quit);



            if (Play) {
                System.out.println(alien1.activity());
                System.out.println("Mike's energy is: " + alien1.getEnergy());
            }
            if (Feed) {
                System.out.println(alien1.feed() + "Energy is replenished to " + alien1.getEnergy());
            }
            if (Sleep) {
                System.out.println(alien1.sleep() + alien1.getEnergy() + " Energy");
            }
            if (Quit) {
                System.out.println("Exiting game...");
                break;
            }
        }

    }



}












