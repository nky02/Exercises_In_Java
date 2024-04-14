import java.util.Scanner;

public class TwoWaySumOfSquares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N, count = 0, square, remainder, sqrtRemainder, i;

        try {
            // input
            System.out.print("Enter an integer N: ");
            N = scanner.nextInt();

            // Iterate over possible square roots up to the square root of N
            for (i = 1; i <= Math.sqrt(N); i++) {
                // Calculate the square of the current index
                square = i * i;
                // Calculate the remainder by subtracting the square from N
                remainder = N - square;
                // Calculate the square root of the remainder
                sqrtRemainder = (int) Math.sqrt(remainder);

                // Check if the square of the square root of the remainder equals the remainder
                if (sqrtRemainder * sqrtRemainder == remainder) {
                    // If the condition is met, print the expression showing N as the sum of squares
                    System.out.println(N + " == " + i + "*" + i + " + " + sqrtRemainder + "*" + sqrtRemainder);
                    // Increment the count of valid expressions found
                    count++;
                }
            }

            if (count >= 2)
                // If at least two expressions were found, print the message indicating so
                System.out.println(N + " is the sum of 2 squares in at least two different ways.");
            else
                System.out.println(N + " is not the sum of 2 squares in two different ways.");
        } finally {
            scanner.close();
        }
    }
}
