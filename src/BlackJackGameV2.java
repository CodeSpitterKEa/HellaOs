import java.util.Random;
import java.util.Scanner;

public class BlackJackGameV2 {
    public static void main(String[] args) {
        //intro

        System.out.println(" Velkommen til Olivers Blackjack spil... ");
        System.out.println("");
        System.out.println("            ##############");
        System.out.println("            #            #");
        System.out.println("            #    Enter   #");
        System.out.println("            #            #");
        System.out.println("            ##############");

        //Fremkalder objekter..
        Scanner scanner = new Scanner(System.in);


        //
        scanner.nextLine();

        System.out.println("Begynder... ");

        startGame(scanner);

    }

    public static void startGame(Scanner scanner) {

        System.out.println("Vil du spille y/n");
        //Starter Spillet
        int score = 0;
        int mScore = 0;
        while(true) {
            String y = "y";
            String n = "n";
            String check = "check";
            String input = scanner.nextLine();
            boolean yes = input.equals(y);
            boolean no = input.equals(n);
            boolean c = input.equals(check);


            if (yes) {
                int roll = dice();
                int machineRoll = dice();
                mScore += machineRoll;
                score += roll;

                System.out.println("Dit kast er: " + roll);
                System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-");
                System.out.println("Vil du spille videre? y/n");
                System.out.println("vil du checke din score? skriv: check");
            }

            //mine parameter for spil udfald

            if (no) {
                System.out.println("Stopper spillet");
                if (score == 21){
                    System.out.println("Blackjack!");
                }
                if (mScore > score) {
                    System.out.println("Du har tabt");
                }
                if (mScore < score) {
                    System.out.println("Du har vundet");
                }
                if (mScore == score) {
                    System.out.println("Uafgjordt!");
                }
                break;
            }
            //Det her er koden til check score inputtet
            if (c) {
                System.out.println("Dine kast: " + score);
                System.out.println("-_-_-_-_-_-_-_-_-_-");
                System.out.println("Maskinens kast: " + mScore);
            }
            if (mScore > 21) {
                System.out.println("Du har vundet");
                break;
            }
            if (mScore == 21) {
                System.out.println("Du har tabt");

            }
            if (mScore == 21 && score == 21) {
                System.out.println("Uafgjordt");
            }

            if (score > 21){
                System.out.println("Du har tabt");
                System.out.println("Din endelige score var " + score);
                break;
            }
        }
    }




    public static int dice() {

        // mit randomizer objekt
        Random random = new Random();

        // laver to dicethrows så den er mere randomized
        int diceOne = random.nextInt(1, 7);
        int diceTwo = random.nextInt(1, 7);


        return diceOne + diceTwo;


    }
}

