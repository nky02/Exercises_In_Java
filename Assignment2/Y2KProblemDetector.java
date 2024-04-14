/*This program that asks a user for their birth year in two digits form, 
the current year, also encoded as two digits (like "99"), and  
 correctly write out the users age in years.
 Written by: Nicky Shane Estrada */

import java.util.Scanner;

public class Y2KProblemDetector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // input
        System.out.print("Year of Birth: ");
        int birthYear = scanner.nextInt();
        System.out.print("Current year: ");
        int currentYear = scanner.nextInt();

        if (birthYear <= currentYear) {
            birthYear += 1900;
        } else {
            birthYear += 2000;
        }

        // Calculating the age
        int age = currentYear - birthYear;

        // Output
        System.out.println("Your age: " + age);

        scanner.close();
    }
}
