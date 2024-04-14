/*This program is an improved version for calculating monthly payment, 
balance, and total monthly payment
Written by: Nicky Shane Estrada*/

import java.util.Scanner;
import java.text.DecimalFormat;

public class CreditCardBill {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // an object to format numbers
        DecimalFormat numForm = new DecimalFormat();

        double balance, monthlyInterestRate, monthlyPayment, totalPayments, interest;

        // input for beginning balance
        System.out.print("Enter the beginning balance: ");
        balance = scanner.nextDouble();

        // input for monthly interest rate
        System.out.print("Enter the monthly interest rate (as a percentage): ");
        monthlyInterestRate = scanner.nextDouble() / 100.0;

        // input for monthly payment
        System.out.print("Enter the monthly payment: ");
        monthlyPayment = scanner.nextDouble();

        totalPayments = 0;
        int month = 1;

        // Loop until the balance is paid off
        while (balance > 0) {
            // Calculate the interest for the current balance
            interest = balance * monthlyInterestRate;
            balance += interest;

            // Adjust the monthly payment if the remaining balance is less than the monthly
            // payment
            if (balance < monthlyPayment) {
                monthlyPayment = balance;
            }

            // Update the balance and total payments
            balance -= monthlyPayment;
            totalPayments += monthlyPayment;

            // Print the current month, balance, and total payments
            System.out.println("Month: " + month + "\t Balance: " + numForm.format(balance) +
                    "\t Total Payments: " + numForm.format(totalPayments));

            // Check if the balance is paid off and exit the loop
            if (balance <= 0) {
                System.out.println("The debt is paid off after " + month + " months.");
                break;
            }

            month++;
        }

        scanner.close();
    }
}
