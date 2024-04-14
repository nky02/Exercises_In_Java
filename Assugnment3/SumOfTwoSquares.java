/*This program asks the user for an integer N and then determines 
if N is the sum of two the squares of two integers
Written by: Nicky Shane Estrada */

import java.util.Scanner;

public class SumOfTwoSquares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N, a, b;
        // input
        System.out.print("Enter an integer N: ");
        N = scanner.nextInt();

        // a boolean variable to track whether N is a sum of two squares
        boolean isSumOfSquares = false;

        for (a = 0; a * a <= N && !isSumOfSquares; a++) {
            // Iterate over possible values of 'b' such that b^2 <= N and N is not yet
            // confirmed as a sum of squares
            for (b = 0; b * b <= N && !isSumOfSquares; b++) {
                // Check if the sum of squares of 'a' and 'b' equals N
                if (a * a + b * b == N) {
                    // If the condition is met, set the to true
                    isSumOfSquares = true;
                }
            }
        }

        // Print the result based on whether N is a sum of squares
        if (isSumOfSquares)
            System.out.println(N + " is a sum of two squares.");
        else
            System.out.println(N + " is not a sum of two squares.");

        scanner.close();
    }
}
