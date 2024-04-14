import java.util.Scanner;

public class SumOfOddIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N, sum = 0;

        // input
        System.out.print("Enter an integer N: ");
        N = scanner.nextInt();

        // Iterate over odd integers from 1 to N and calculate their sum
        for (int i = 1; i <= N; i += 2) {
            sum += i;
        }

        // Print the sum of all odd integers from 1 to N
        System.out.println("Sum of all odd integers from 1 to " + N + " is: " + sum);

        // Print the square of N
        System.out.println("N squared is: " + (N * N));

        scanner.close();
    }
}
