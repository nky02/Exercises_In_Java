import java.util.Scanner;

public class JetLagCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of hours of travel: ");
        int hours = scanner.nextInt();

        System.out.print("Enter number of time zones crossed: ");
        int zones = scanner.nextInt();

        System.out.print("Enter departure time (in 24-hour format): ");
        int departTime = scanner.nextInt();

        System.out.print("Enter arrival time (in 24-hour format): ");
        int arriveTime = scanner.nextInt();

        int depart = 0;
        if (departTime >= 0 && departTime < 8) {
            depart = 4;
        } else if (departTime >= 8 && departTime < 12) {
            depart = 0;
        } else if (departTime >= 12 && departTime < 18) {
            depart = 1;
        } else if (departTime >= 18 && departTime < 22) {
            depart = 3;
        } else {
            depart = 5;
        }

        int arrive = 0;
        if (arriveTime >= 0 && arriveTime < 8) {
            arrive = 1;
        } else if (arriveTime >= 8 && arriveTime < 12) {
            arrive = 4;
        } else if (arriveTime >= 12 && arriveTime < 18) {
            arrive = 2;
        } else if (arriveTime >= 18 && arriveTime < 22) {
            arrive = 0;
        } else {
            arrive = 3;
        }

        double daysOfRecovery = (hours / 2.0 + (zones - 3) + depart + arrive) / 10.0;
        System.out.println("Number of days needed for recovery: " + daysOfRecovery + " days");

        scanner.close();
    }
}