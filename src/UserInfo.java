import java.util.Scanner;

public class UserInfo {
    public static void main(String[] args) {

        Scanner Scanner = new Scanner(System.in);
        System.out.println("Hvad er dit navn? ");
        String inputname = Scanner.nextLine();
        System.out.println("Hvad er din ynglingsfarve? ");
        String farveinput = Scanner.nextLine();
        System.out.println("Dit navn er: "+inputname+"."+" Og din ynglingsfarve er: "+farveinput);




    }
}
