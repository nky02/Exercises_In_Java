import java.util.Scanner;

public class WedgeOfStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Initial number of stars: ");
        int numberOfStars = scanner.nextInt();
        scanner.close();

        int currentNumber = numberOfStars;

        while (currentNumber > 0) {
            int starsToPrint = currentNumber;
            while (starsToPrint > 0) {
                System.out.print("*");
                starsToPrint--;
            }
            System.out.println(starsToPrint);
            currentNumber--;
        }
    }
}