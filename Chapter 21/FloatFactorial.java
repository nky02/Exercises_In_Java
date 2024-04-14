import java.util.Scanner;

public class FloatFactorial {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long N;
        double fact = 1;

        System.out.print("Enter N: ");
        N = scan.nextLong();

        if (N >= 0 && N <= 20) {
            while (N > 1) {
                fact = fact * N;
                N = N - 1;
            }
            double result = fact / (fact / (N + 1));
            System.out.println("N! / (N-1)! is approximately: " + result);
        } else {
            System.out.println("N must be between 0 and 20");
            System.out.println("Factorial for N less than 0 is not defined.");
            System.out.println("Factorial for N greater than 20 causes overflow.");
        }
        scan.close();
    }

}
