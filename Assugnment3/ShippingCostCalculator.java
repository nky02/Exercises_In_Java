/*This program calculates the shipping charge based on the weight of the order.
Written by: Nicky Shane Estrada*/

import java.util.Scanner;

public class ShippingCostCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Constants for handling fee and extra weight fee
        final double HANDLING_FEE = 3.00;
        final double EXTRA_WEIGHT_FEE = 0.25;

        double weight, shippingCost;

        // inpput
        System.out.print("Weight of Order: ");
        weight = scanner.nextDouble();

        // calculates shipping cost
        while (weight > 0) {
            // Check if the weight is within the first 10 pounds
            if (weight <= 10) {
                shippingCost = HANDLING_FEE;
            } else {
                // Calculate shipping cost for weights over 10 pounds
                double extraWeight = weight - 10;
                shippingCost = HANDLING_FEE + (extraWeight * EXTRA_WEIGHT_FEE);
            }

            // Output the calculated shipping cost
            System.out.printf("Shipping Cost: $%.2f\n\n", shippingCost);

            // input for another order
            System.out.print("Weight of Order (enter 0 to exit): ");
            weight = scanner.nextDouble();
        }

        // print a goodbye message for loop exit
        System.out.println("Bye!");

        scanner.close();
    }
}
