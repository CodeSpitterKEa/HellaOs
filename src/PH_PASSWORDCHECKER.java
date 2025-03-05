import java.util.Scanner;

public class PH_PASSWORDCHECKER {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        final String Correct_password = "Bigman";

        System.out.println("indtast et password: ");
        String inputpassword = scanner.nextLine();

    }

    public static boolean isValidPassword(String password) {
        if (isNotValidPassword(password)) {
            return false; }
        if (password.length() <8) {
            return false; }
        for (int i = 0; i < password.length(); i++) {
            char iChar = password.charAt(i);
            boolean isValidPassword = isCharAlphaNumeric(iChar);
            if (!isValidPassword) {
                System.out.println("Invalid Password");
                return false; }
        }
        System.out.println("Password accepted");
        return true;
    }

    public static boolean isCharAlphaNumeric(char ch) {
        return ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9'));
    }

    public static boolean isNotValidPassword(String invalidPassword) {
        if (invalidPassword.contains("qwerty") || invalidPassword.contains("secret")) {
            System.out.println("Invalid password!");
            return true;
        }
        return false;
    }





}
