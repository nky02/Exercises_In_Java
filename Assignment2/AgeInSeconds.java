/*Thsi program asks for your age in years, months, and days a
nd writes out your age in seconds
Written by: Nicky Shane EStrada */

import java.util.Scanner;

public class AgeInSeconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age in years: ");
        int years = scanner.nextInt();

        System.out.print("Enter the number of months: ");
        int months = scanner.nextInt();

        System.out.print("Enter the number of days: ");
        int days = scanner.nextInt();

        //calculates days, months and years based on the input data
        int totalDays = days + (years * 365) + ((months - 1) * 31) + (months / 2);
        int ageInSeconds = totalDays * 24 * 60 * 60;

        System.out.println("Your age in seconds is: " + ageInSeconds);

        long expectedLifespanSeconds = 2500000000L;
        double percentageLived = (ageInSeconds / expectedLifespanSeconds) * 100;
        System.out.printf("You have lived %.2f%% of your expected lifespan.", percentageLived);

        scanner.close();
    }
}
