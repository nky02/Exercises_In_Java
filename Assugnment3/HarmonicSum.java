
/*This program calculates for a harmonic sum
 Written by: Nicky Shane Estrada*/
import java.util.Scanner;

public class HarmonicSum {
    public static void main(String[] args) {

        // Initialize count and sum variables
        int limitNum, count;
        double value, sum;

        // input
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter N (a number for integer limit)");
        limitNum = scan.nextInt();

        count = 1;
        sum = 0;
        //Calculate the harmonic sum
        while (count <= limitNum) {
            value = 1.0 / count;

            // Add the current term to the sum
            sum += value;
            count++;

        }
        // output
        System.out.println("Sum is: " + sum);
        scan.close();
    }

}
