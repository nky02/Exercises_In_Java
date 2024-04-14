/*This program determines the price of a movie ticket.  It asks for the customer's age 
and for the time on a 24-hour clock or military time format
Written by: Nicky Shane Estrada */

import java.util.Scanner;

public class MatineeMovieTickets {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // input
        System.out.print("Enter your age: ");
        int age = scan.nextInt();

        System.out.print("Enter the time of the movie (24 jour clock format: ");
        int time = scan.nextInt();

        // Process
        double ticketPrice;

        if (age > 13) {// Adult
            if (time < 1700) // Matinee
                ticketPrice = 5.00;
            else
                ticketPrice = 8.00;
        }

        else // Children
        if (time < 1700) // Matinee
            ticketPrice = 2.00;
        else
            ticketPrice = 4.00;

        // Output
        System.out.println("The ticket price is: $" + ticketPrice);

        scan.close();
    }
}
