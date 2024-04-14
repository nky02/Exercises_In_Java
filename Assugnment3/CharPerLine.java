
/*This program asks the user to enter a word then writes that word one character per line
 Written by: Nicky Shane Estrada*/
import java.util.Scanner;

public class CharPerLine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word;
        int index, count;

        // input
        System.out.println("Enter a word: ");
        word = scan.nextLine();
        count = word.length();

        index = 0;
        // Iterate each character of the word and print them one per line
        while (index < count) {
            System.out.println(word.charAt(index));
            index++;
        }

        scan.close();

    }
}