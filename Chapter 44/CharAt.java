import java.util.Scanner;

public class CharAt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String inputString = scanner.nextLine();

        // Loop through the string and print each character on a new line
        for (int i = 0; i < inputString.length(); i++) {
            // Uses charAt() to get the character at index i
            char character = inputString.charAt(i);
            System.out.println(character);
        }

        scanner.close();
    }
}