
/*This program simulates a log in process using equals() method
Written by: Nicky Shane Estrada*/
import java.util.Scanner;

public class LoginSimulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean loggingIn = true;

        while (loggingIn) {

            // input
            System.out.print("User Name: ");
            String userName = scanner.next();

            System.out.print("Password : ");
            String password = scanner.next();

            // Check the entered username and password based on the default pairing of data
            if (userName.equals("joy") && password.equals("sun")) {
                System.out.println("You have logged on with priority 4");
            } else if (userName.equals("gates") && password.equals("monopoly")) {
                System.out.println("You have logged on with priority 1");
            } else if (userName.equals("jobs") && password.equals("apple")) {
                System.out.println("You have logged on with priority 3");
            } else if (userName.equals("root") && password.equals("secret")) {
                System.out.println("You have logged on with priority 5");

                // for terminating the loop
            } else if (userName.equals("quit") && password.equals("exit")) {
                loggingIn = false;
                System.out.println("System shutting down.\nBye.");

                // If neither the username nor the password match, logon fails
            } else {
                System.out.println("Logon failed");
            }
        }

        scanner.close();
    }
}
