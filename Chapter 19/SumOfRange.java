import java.util.Scanner;

public class SumOfRange {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sumHigh, sumLowMinusOne, sum = 0;

        System.out.println("Enter low:");
        int low = scan.nextInt();

        System.out.println("Enter high:");
        int high = scan.nextInt();

        int currentNumber = low;

        // Calculate sum from low to high
        while (currentNumber <= high) {
            sum += currentNumber;
            currentNumber++;
        }

        sumHigh = (high * (high + 1)) / 2; // Calculate sum from 1 to high
        sumLowMinusOne = ((low - 1) * low) / 2; // Calculate sum from 1 to low - 1

        sum = sumHigh - sumLowMinusOne;
        System.out.println("Sum = " + sum);

        scan.close();
    }
}
