import java.util.Scanner;

public class SumOfIntegers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int formulaSum;

        System.out.print("Enter N: ");
        int n = scanner.nextInt();

        int loopSum = 0;
        int i = 1;

        while (i <= n) {
            loopSum += i;
            i++;
        }

        formulaSum = (n * (n + 1)) / 2;
        System.out.println("Loop Sum = " + loopSum);
        System.out.println("Formula Sum = " + formulaSum);

        scanner.close();
    }
}
