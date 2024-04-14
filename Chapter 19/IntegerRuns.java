import java.util.Scanner;

public class IntegerRuns {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter starting value: ");
        int initialValue = scan.nextInt();

        System.out.print("Enter starting value: ");
        int finalValue = scan.nextInt();

        while (initialValue <= finalValue) {
            if (initialValue > finalValue)
                System.out.println("Error: End value must be greater than or equal to Start value.");
            else
                System.out.println(initialValue);
            initialValue += 1;
        }

        scan.close();
    }
}