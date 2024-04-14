import java.util.Scanner;

public class PowerCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter X");
        double X = scanner.nextDouble();

        System.out.println("Enter N");
        int N = scanner.nextInt();

        if (N < 0) {
            System.out.println("N must be a positive integer.");
        } else {
            double result = 1.0;
            int i = N;

            while (i > 0) {
                result *= X;
                i--;
            }

            System.out.println(X + " raised to the power " + N + " is: " + result);
        }

        scanner.close();
    }
}