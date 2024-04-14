/*This program takes orders from the Internet. It asks for the item, its price in cents,
and if express delivery is wanted. The program writes out the order and the charges. 
Written by: Nicky Shane Estrada*/

import java.util.Scanner;

public class InternetDelicatessen {

    public static void main(String[] args) {
        final double regularDeliveryFee = 2.00;
        final double expressDeliveryFee = 3.00;

        Scanner scan = new Scanner(System.in);

        // input
        System.out.print("Enter the item: ");
        String itemName = scan.nextLine();

        System.out.print("Enter the price: ");
        double itemPrice = scan.nextDouble();

        System.out.print("Overnight delivery (0==no, 1==yes): ");
        int deliveryInput = scan.nextInt();
        boolean delivery = deliveryInput == 1;

        double total;
        double deliveryFee;

        // Calculating total and delivery fee based on user input
        if (delivery) {

            if (itemPrice < 10) {
                // If item price is less than $10, add regular and express delivery fee
                total = itemPrice + regularDeliveryFee + expressDeliveryFee;
                deliveryFee = regularDeliveryFee + expressDeliveryFee;
            } else
                // If item price is $10 or more, add only express delivery fee
                total = itemPrice + expressDeliveryFee;
            deliveryFee = expressDeliveryFee;

        } else {
            if (itemPrice < 10) {
                // delievery fee is free
                total = itemPrice;
                deliveryFee = 0.00;

            } else {
                total = itemPrice + regularDeliveryFee;
                deliveryFee = regularDeliveryFee;
            }
        }

        // output receipt
        System.out.println("Invoice: ");
        System.out.printf("  %-13s %.2f%n", itemName, itemPrice);
        System.out.printf("  %-13s %.2f%n", "delivery", deliveryFee);
        System.out.printf("  %-13s %.2f%n", "total", total);
        scan.close();

    }
}
