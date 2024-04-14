import java.util.Scanner;

public class ModifiedMilDollars {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double initialAmount, annualContribution, rate, dollars;
        int year;

        System.out.print("Enter the annual interest rate (in percent): ");
        rate = scanner.nextDouble() / 100.0;

        System.out.print("Enter the initial investment amount: ");
        initialAmount = scanner.nextDouble();

        System.out.print("Enter the annual contribution: ");
        annualContribution = scanner.nextDouble();

        dollars = initialAmount;
        year = 0;

        while (dollars < 1000000) {
            year++;
            dollars += dollars * rate;
            dollars += annualContribution;
            System.out.printf("Year %d: $%.2f\n", year, dollars);
        }

        System.out.printf("After %d years at %.2f%% interest you will have $%.2f dollars.\n",
                year, rate * 100, dollars);

        scanner.close();
    }
}
