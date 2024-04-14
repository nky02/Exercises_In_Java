/*This program calculates miles per gallon for a list of cars
    Written by: Nicky Shane Estrada*/

import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int initialMiles, finalMiles;
        double milesPerGallon;

        while (true) {
            System.out.print("Initial miles: ");
            initialMiles = scanner.nextInt();
            if (initialMiles < 0) {
                break;
            }

            // Get final miles and gallons from the user
            System.out.print("Final miles: ");
            finalMiles = scanner.nextInt();
            System.out.print("Gallons: ");
            int gallons = scanner.nextInt();

            // Calculate miles per gallon
            if (gallons != 0) {
                milesPerGallon = (double) (finalMiles - initialMiles) / gallons;
                System.out.println("Miles per Gallon: " + milesPerGallon);
            } else {
                System.out.println("Gallons cannot be zero.");
            }
        }

        System.out.println("bye");

        scanner.close();
    }
}