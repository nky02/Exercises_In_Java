import java.util.Scanner;

public class PasswordChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = "";

        boolean passwordAccepted = false;
        while (!passwordAccepted) {
            System.out.println("Enter your password:");
            password = scanner.nextLine();

            if (password.length() >= 7) {
                boolean hasUpper = false;
                boolean hasLower = false;
                boolean hasDigit = false;

                for (int i = 0; i < password.length(); i++) {
                    char ch = password.charAt(i);
                    if (Character.isUpperCase(ch)) {
                        hasUpper = true;
                    } else if (Character.isLowerCase(ch)) {
                        hasLower = true;
                    } else if (Character.isDigit(ch)) {
                        hasDigit = true;
                    }

                    // If all conditions are met, the password is acceptable
                    if (hasUpper && hasLower && hasDigit) {
                        passwordAccepted = true;
                        break;
                    }
                }

                if (!passwordAccepted) {
                    System.out.println("That password is not acceptable.");
                }
            } else {
                System.out.println("That password is not acceptable.");
            }
        }

        System.out.println("Acceptable password.");
    }
}
