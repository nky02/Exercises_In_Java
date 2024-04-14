/*This program adds up integers, and writes writes a message if the first value
 entered by the user is the sentinal value of zero
        Written by: Nicky Shane Estrada */

import java.util.Scanner;

public class InRangeAdder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int lowEndint, highEndInt, data;
        int sumInRange = 0, sumOutRange = 0;

        System.out.print("Low end of range: ");
        lowEndint = scan.nextInt();

        System.out.print("High end of range: ");
        highEndInt = scan.nextInt();

        System.out.print("Enter data: ");
        data = scan.nextInt();

        while (data != 0) {
            if (data >= lowEndint && data <= highEndInt) {
                sumInRange += data;
            } else {
                sumOutRange += data;
            }

            System.out.print("Enter data: "); 
            data = scan.nextInt(); 
        }

        System.out.println("Sum of in-range values: " + sumInRange);
        System.out.println("Sum of out-of-range values: " + sumOutRange);

        scan.close();
    }
}
