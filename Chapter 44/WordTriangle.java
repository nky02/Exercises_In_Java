import java.util.Scanner;

public class WordTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word -->");
        String word = scanner.nextLine();

        for (int i = 0; i < word.length(); i++) {
            // For each line, print spaces equal to the line number
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            // Print the substring from the current line number to the end minus one
            // character
            System.out.println(word.substring(i, word.length() - i));
        }
    }
}