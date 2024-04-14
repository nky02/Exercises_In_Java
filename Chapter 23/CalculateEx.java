import java.util.Scanner;

public class CalculateEx {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double x, sum, term;
        int n;

        System.out.print("Enter x: ");
        x = scan.nextDouble();

        sum = 1.0;
        term = 1.0;
        n = 1;

        while (term > 1.0E-12) {
            term = term * x / n;
            sum = sum + term;
            System.out.printf("n:%d \tterm: %g \t\t\tsum: %.16f\n", n, term, sum);
            n++;
        }

        System.out.printf("my e^x: %.15f\n", sum);
        System.out.printf("real e^x: %.15f\n", Math.exp(x));

        scan.close();
    }
}