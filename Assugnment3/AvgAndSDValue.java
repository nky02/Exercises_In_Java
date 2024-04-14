
/*This program  computes the average and the standard deviation of a set of N floating point numbers
 Written by: Nicky Shane Estrada*/
import java.util.Scanner;
import java.lang.Math;

public class AvgAndSDValue {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, index;
        double floatingValue, average, numSquared, sumOfFloatingNum, sumOfSquares, avgSquare, standardDeviation;

        // input
        System.out.println("Enter N (nuber of values): ");
        n = scan.nextInt();

        index = 0;
        sumOfFloatingNum = 0;
        sumOfSquares = 0;

        // compute sum of floating numbers and sum of squares
        while (index < n) {
            System.out.println("Enter a floating value: ");
            floatingValue = scan.nextDouble();

            numSquared = floatingValue * floatingValue;
            sumOfFloatingNum += floatingValue;
            sumOfSquares += numSquared;
            index++;

        }
        // Calculate the average and average of squares
        average = sumOfFloatingNum / n;
        avgSquare = sumOfSquares / n;

        // calculates for the standart deviation
        standardDeviation = Math.sqrt(avgSquare - (average * average));

        // output
        System.out.println("Average: " + average);
        System.out.printf("Standard Deviation(SD): %.10f ", standardDeviation);

        scan.close();
    }
}
