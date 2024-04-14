/*This program asks the user for a positive integer N and then calculates
 a new value for N based on whether it is even or odd.
Written by: Nicky Shane Estrada*/

import java.util.Scanner;

public class HailstoneNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // input
        System.out.print("Enter a positive integer N: ");
        long N = scanner.nextLong();

        int length = 0;
        long max = N;

        // loop until N becomes 1
        while (N != 1) {
            // Calculate the next value in the sequence if whether N is even or odd
            if (N % 2 == 0) {
                N = N / 2;
            } else {
                N = 3 * N + 1;
            }

            // Update the maximum if necessary
            if (N > max) {
                max = N;
            }

            // Increment the sequence length and pritn the next value in the sequence
            length++;
            System.out.println(N);
        }

        // Output the length of the sequence and the maximum value
        System.out.println("The length of the sequence is " + length);
        System.out.println("The maximum value in the sequence was " + max);

        scanner.close();
    }
}
