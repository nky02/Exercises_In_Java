/*This program asks for a number, computes and prints its square root if the number is positive
Written by: Nicky Shane Estrada*/

import java.util.Scanner;

public class ImprovedSquareRoot {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number;
        String userInput;

        // outer loop for input process
        do {
            do {
                System.out.print("Enter a number--> ");

                // Inner loop for checking if the input is a positive number
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

            // Compute and print the square root of the positive number
            System.out.println("Square root of " + number + " is " + Math.sqrt(number));

            do {
                System.out.print("Do you wish to continue (yes or no)? ");
                userInput = scanner.next();

                if (!userInput.equals("yes") && !userInput.equals("no")) {
                    System.out.println(">>>Please respond with (yes or no)<<<");
                }
            } while (!userInput.equals("yes") && !userInput.equals("no"));

        } while (userInput.equals("yes"));

        // Output a bye message when the user exits the loop
        System.out.println("Bye");

        scanner.close();
    }
}