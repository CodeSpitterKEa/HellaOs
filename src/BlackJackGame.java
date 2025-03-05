import java.util.Random;
import java.util.Scanner;

public class BlackJackGame {
    public static void main(String[] args) {
        System.out.println(" Velkommen til Olivers Blackjack spil... ");
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        scanner.nextLine();


        System.out.println("Vil du spille, JA/NEJ: ");
        String inputstart = scanner.nextLine();

        String start = "JA";
        String start1 = "JA";
//      ^ Den her string er for introen
        String y = "100";
        String n = "NEJ";


        startScreen(start, inputstart, random, n, y, scanner, start1);


    }

    public static void startScreen(String start, String inputstart, Random random, String y, String n, Scanner scanner, String start1) {
        boolean instart = inputstart.equals(start);
        if (instart) {
            System.out.println("Begynder... ");
            startGame(random, y, n, scanner, inputstart, start, start1);
        } else {
            System.out.println("Goddag");
            return;
        }
    }

    public static void startGame(Random random, String y, String n, Scanner scanner, String inputstart, String start, String start1) {

        int diceNum = random.nextInt(2, 13);
        int diceMachine = random.nextInt(2, 13);


        int diceSum = 0;
        int diceMachineSum = 0;


        diceSum+=diceNum;
        diceMachineSum+=diceMachine;



        System.out.println("Dit første kast er: " + diceNum);
        System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");
        System.out.println("Maskinen har kastet: " + diceMachine);

        {

            scanner.nextLine();

            System.out.println("Vil du spille videre? Skriv JA/NEJ");

            String inputstart1 = scanner.nextLine();
            int diceNum2 = random.nextInt(2, 13);
            int diceMachine2 = random.nextInt(2, 13);
            boolean go = inputstart1.equals(start1);

            if (go) {
                diceSum+=diceNum2;
                diceMachineSum+=diceMachine2;
                System.out.println("Kaster...");
                System.out.println("Dit kast er: "+diceNum2);
                System.out.println("Du har nu "+diceSum);
                System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");
                System.out.println("Maskinens kast er: " + diceMachine2);
                System.out.println("Maskinen har nu: " + diceMachineSum);


            }else {
                System.out.println("Goddag");
                return;
                //få den til at terminate ordenligt
            }





            boolean isRunning = true;

            while (isRunning) {






            }

        }


    }

    public static int diceCalc(Random random, int kastnummer, int diceNum , int diceNum2) {
        int diceSum = 0;
        diceSum+=diceNum;
        diceSum+=diceNum2;

        System.out.println(diceSum);
        return diceSum;
    }







}
