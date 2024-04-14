/*This program asks the user for the air temperature and the steam temperature
 then calculates and print out the maximum possible efficiency of a steam engine.
 Written by: Nicky Shane Estrada*/

import java.util.Scanner;

public class SteamEngineEfficiency {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double steamTemp, airTemp, maxEfficiency;
        // input
        System.out.println("Enter  steam temperature: ");
        steamTemp = scan.nextDouble();

        System.out.println("Enter air temperature: ");
        airTemp = scan.nextDouble();

        if (steamTemp < 373)
            System.out.println("Maximum possible efficiency: 0 ");

        else {
            // calculates the maximum effeciency
            maxEfficiency = 1 - airTemp / steamTemp;

            // output the result
            System.out.printf(" Maximum possible efficiency: %.2f%n", maxEfficiency);
        }
        scan.close();
    }
}
