import java.util.Scanner;

public class voting {
    public static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("indtast din alder brors ");
        int age = scanner.nextInt();


        }

    }

    public static boolean evoting(int age) {
        if (age < 18) {
            System.out.println("kom tilbage når du er gammel nok");
            return false;

    }
        return true;
}

public static void main() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("indtast din alder brors ");
    int age = scanner.nextInt();
}
