import java.util.Scanner;

public class IntSquare {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number: ");
        double number = scan.nextDouble();
        double square = number * number;
        double sqrRoot = Math.sqrt(number);

        System.out.println("The squared value of " + number + " is " + square + " and its square root is " + sqrRoot);

        scan.close();
    }
}
