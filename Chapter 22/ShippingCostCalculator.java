/*This program calculates the shipping charge based on the weight of the order
    Written by: Nicky Shane Estrada*/

import java.util.Scanner;

public class ShippingCostCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double HANDLING_FEE = 3.00;
        final double EXTRA_WEIGHT_FEE = 0.25;

        double weight, shippingCost;

        System.out.print("Weight of Order: ");
        weight = scanner.nextDouble();

        while (weight > 0) {
            if (weight <= 10) {
                shippingCost = HANDLING_FEE;
            } else {
                double extraWeight = weight - 10;
                shippingCost = HANDLING_FEE + (extraWeight * EXTRA_WEIGHT_FEE);
            }

            System.out.printf("Shipping Cost: $%.2f\n\n", shippingCost);

            System.out.print("Weight of Order: ");
            weight = scanner.nextDouble();
        }

        System.out.println("bye");

        scanner.close();
    }
}
