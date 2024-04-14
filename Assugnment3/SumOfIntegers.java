
/*This program asks the user for N and then sum all the integers (inclusive) between 1 and N.
 Written by: Nicky Shane Estrada*/
import java.util.Scanner;

public class SumOfIntegers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int formulaSum;
        // input
        System.out.print("Enter N: ");
        int n = scanner.nextInt();

        // Initialize loop sum and loop iteration
        int loopSum = 0;
        int i = 1;

        // Calculate loop sum
        while (i <= n) {
            loopSum += i;
            i++;
        }

        // Calculate formula sum using the formula for the sum of sequential integers
        formulaSum = (n * (n + 1)) / 2;

        // output
        System.out.println("Loop Sum = " + loopSum);
        System.out.println("Formula Sum = " + formulaSum);

        scanner.close();
    }
}
