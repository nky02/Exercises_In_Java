import java.util.Scanner;

public class CubicSumTwoSquares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int limit, cubeRoot, a, b, N;

        // ask for upper limit
        System.out.print("Enter upper limit: ");
        limit = scanner.nextInt();

        for (N = 1; N <= limit; N++) {
            cubeRoot = (int) Math.cbrt(N); // Check if the current number is a perfect cube
            if (cubeRoot * cubeRoot * cubeRoot == N) {
                System.out.println(N + " is a cube: " + cubeRoot + "^3");

                boolean isSumOfSquares = false;

                // Iterate pairs of numbers to check if their squares sum up to the current no.
                for (a = 0; a * a <= N && !isSumOfSquares; a++) {
                    for (b = a; b * b <= N && !isSumOfSquares; b++) {
                        if (a * a + b * b == N) {
                            isSumOfSquares = true;
                            System.out.println(N + " is the sum of 2 squares");
                            System.out.println(N + " == " + a + "*" + a + " + " + b + "*" + b);
                        }
                    }
                }

                if (!isSumOfSquares) {
                    System.out.println(N + " is not the sum of two squares.");
                }
            }
            scanner.close();

        }
    }
}
