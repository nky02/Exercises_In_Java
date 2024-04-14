import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        double number;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a digit: ");
        number = scan.nextDouble();

        System.out.println("You entered " + number);

        scan.close();
    }
}
