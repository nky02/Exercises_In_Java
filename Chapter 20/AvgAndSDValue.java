import java.util.Scanner;
import java.lang.Math;

public class AvgAndSDValue {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, index;
        double floatingValue, average, numSquared, sumOfFloatingNum, sumOfSquares, avgSquare, standardDeviation;

        System.out.println("Enter N (nuber of values): ");
        n = scan.nextInt();

        index = 0;
        sumOfFloatingNum = 0;
        sumOfSquares = 0;

        while (index < n) {
            System.out.println("Enter a floating value: ");
            floatingValue = scan.nextDouble();

            numSquared = floatingValue * floatingValue;
            sumOfFloatingNum += floatingValue;
            sumOfSquares += numSquared;
            index++;

        }

        average = sumOfFloatingNum / n;
        avgSquare = sumOfSquares / n;
        standardDeviation = Math.sqrt(avgSquare - (average * average));

        System.out.println("Average: " + average);
        System.out.printf("Standard Deviation(SD): %.10f ", standardDeviation);

        scan.close();
    }
}
