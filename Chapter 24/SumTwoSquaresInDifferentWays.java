import java.util.Scanner;

public class SumTwoSquaresInDifferentWays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // input
        System.out.print("Enter upper limit: ");
        int upperLimit = scanner.nextInt();

        for (int N = 1; N <= upperLimit; N++) {
            int count = 0;
            // Iterate over possible square roots up to the square root of N
            for (int i = 1; i <= Math.sqrt(N); i++) {
                // Calculate the square of the current index
                int square = i * i;
                // Calculate the remainder by subtracting the square from N
                int remainder = N - square;
                // Calculate the square root of the remainder
                int sqrtRemainder = (int) Math.sqrt(remainder);

                if (sqrtRemainder >= i && sqrtRemainder * sqrtRemainder == remainder) {
                    count++;

                    if (count == 1) {
                        System.out.println(N + " is the sum of 2 squares");
                    }

                    System.out.println(N + " == " + i + "*" + i + " + " + sqrtRemainder + "*" + sqrtRemainder);
                }
            }
        }
        scanner.close();
    }
}
