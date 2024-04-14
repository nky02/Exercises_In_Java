import java.util.Scanner;

public class ImprovedSquareRoot {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number;
        String userInput;

        do {
            do {
                System.out.print("Enter a number--> ");
                while (!scanner.hasNextDouble()) {
                    System.out.println(">>>Please enter a number<<<");
                    scanner.next(); // Clear the invalid input

                    System.out.print("Enter a number--> ");
                }
                number = scanner.nextDouble();

                if (number < 0) {
                    System.out.println(">>>number must be positive<<<");
                }
            } while (number < 0);

            System.out.println("Square root of " + number + " is " + Math.sqrt(number));

            do {
                System.out.print("Do you wish to continue (yes or no)? ");
                userInput = scanner.next();

                if (!userInput.equals("yes") && !userInput.equals("no")) {
                    System.out.println(">>>Please respond with (yes or no)<<<");
                }
            } while (!userInput.equals("yes") && !userInput.equals("no"));

        } while (userInput.equals("yes"));

        System.out.println("Bye");

        scanner.close();
    }
}