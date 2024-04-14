import java.util.Scanner;

public class SumOfDivisors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N, sum = 0;

        // input
        System.out.print("Enter an integer N: ");
        N = scanner.nextInt();

        // Iterate over integers from 1 up to N/2 to find divisors of N
        for (int i = 1; i <= N / 2; i++) {
            // Check if i is a divisor of N
            if (N % i == 0) {
                // If i is a divisor, add it to the sum
                sum += i;
            }
        }
        sum += N;

        // Print the sum of divisors of N
        System.out.println("Sum of divisors of " + N + " is: " + sum);

        // Check if the sum of divisors (excluding N itself) equals N
        if (sum - N == N)
            // If the sum of divisors equals N, N is a perfect number
            System.out.println(N + " is a perfect number.");
        else
            // If the sum of divisors does not equal N, N is not a perfect number
            System.out.println(N + " is not a perfect number.");

        scanner.close();
    }
}
