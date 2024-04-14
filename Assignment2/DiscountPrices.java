/*Thi sprogramasks for the amount of a
 purchase, then calculates the discounted price
Written by: Nicky Shane EStrada */

import java.util.Scanner;

public class DiscountPrices {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int amount;

        System.out.println("Enter amount of purchases(in cents):  ");
        amount = scan.nextInt();

        // convert cents to dollars
        int amountInDollars = amount / 100;
        int discountedPrice;

        if (amountInDollars > 10)

            discountedPrice = amount - (amount * 10 / 100);

        else
            discountedPrice = amount;

        System.out.println("DiscountedPrice: " + discountedPrice);

        scan.close();

    }
}
