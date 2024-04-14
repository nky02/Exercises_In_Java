import java.util.Scanner;

public class NewtonsMethod {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double b, guess, newX;

        System.out.print("Enter a positive real number B: ");
        b = scan.nextDouble();

        if (b <= 0 || b >= 1) {
            System.out.println("Invalid input. B must be a positive number less than 1.");
        } else {
            guess = 0.00001; 
            newX = guess;

            while (Math.abs(newX - guess) >= 1e-12) {
                guess = newX;
                newX = guess * (2 - b * guess);
            }

            System.out.println("1/B ≈ " + newX);
        }

        scan.close();
    }
}
