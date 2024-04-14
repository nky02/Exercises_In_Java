import java.util.Scanner;

public class ArithmeticHarmonic {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first number: ");
        double num1 = scan.nextDouble();

        System.out.println("Enter second number: ");
        double num2 = scan.nextDouble();

        double arithmeticMean = Double.sum(num1, num2) / 2;
        double harmonicMean = 2 / Double.sum((1 / num1), (1 / num2));

        System.out.println("Arithmetic mean: " + arithmeticMean);
        System.out.println("Harmonic mean: " + harmonicMean);

        scan.close();

    }
}
