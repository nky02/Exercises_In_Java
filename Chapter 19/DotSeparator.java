import java.util.Scanner;

public class DotSeparator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first word:\n");
        String firstWord = scanner.next();

        System.out.print("Enter second word:\n");
        String secondWord = scanner.next();

        int totalLength = 30;
        int numDots = totalLength - firstWord.length() - secondWord.length();

        System.out.print(firstWord);

        int count = 0;
        while (count < numDots) {
            System.out.print(".");
            count++;
        }
        System.out.print(secondWord);
        scanner.close();

    }

}