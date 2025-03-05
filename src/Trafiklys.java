import java.util.Scanner;

public class Trafiklys {
    public static void main(String[] args) {

        System.out.println("Hvad for en farve ser du? ");
        Scanner scanner = new Scanner(System.in);
        String farve = scanner.nextLine();

        switch (farve) {
            case "rød":
                System.out.println("stop");
                break;


            case "gul":
                System.out.println("vent");
                break;

            case "grøn":
                System.out.println("gå");
                break;


                
            default:
                System.out.println("Din adem");
        }
        }
    }
