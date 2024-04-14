
/*This program is an improved version of calculating monthly
 payment, balance, and total monthly payment
 Written by: Nicky Shane Estrada*/
import java.util.Scanner;
import java.text.DecimalFormat;

public class CreditCardBill {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat numForm = new DecimalFormat();
        double balance, monthlyInterestRate, monthlyPayment, totalPayments, interest;

        System.out.print("Enter the beginning balance: ");
        balance = scanner.nextDouble();

        System.out.print("Enter the monthly interest rate (as a percentage): ");
        monthlyInterestRate = scanner.nextDouble() / 100.0;

        System.out.print("Enter the monthly payment: ");
        monthlyPayment = scanner.nextDouble();

        totalPayments = 0;
        int month = 1;

        while (balance > 0) {
            interest = balance * monthlyInterestRate;
            balance += interest;

            if (balance < monthlyPayment) {
                monthlyPayment = balance;
            }

            balance -= monthlyPayment;
            totalPayments += monthlyPayment;

            System.out.println("Month: " + month + "\t balance: " + numForm.format(balance) +
                    "\t total payments: " + numForm.format(totalPayments));

            if (balance <= 0) {
                System.out.println("The debt is paid off after " + month + " months.");
                break;
            }

            month++;
        }

        scanner.close();
    }
}
