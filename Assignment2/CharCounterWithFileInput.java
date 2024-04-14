/*This program has an added logic with the CharacterConter program that prints out the
 raw counts but with the percentages of each category in the file
 Written by: Nicky Shane Estrada*/

import java.util.Scanner;

public class CharCounterWithFileInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initializztion
        int vowels = 0, consonants = 0, punctuation = 0, spaces = 0, totalChars = 0;

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine(); // Read the next line of input
            totalChars += line.length(); // Update the total number of characters

            // Iterate through each character in the line
            for (int i = 0; i < line.length(); i++) {
                // Get the current character
                char ch = line.charAt(i);

                // check and categorize each character
                switch (Character.toLowerCase(ch)) {
                    case 'a':
                    case 'e':
                    case 'i':
                    case 'o':
                    case 'u':
                        // If character is a vowel, increment vowel count
                        vowels++;
                        break;
                    case ' ':
                        // If character is a space, increment space count
                        spaces++;
                        break;
                    case '.':
                    case ',':
                    case '!':
                    case '?':
                    case ':':
                    case ';':
                    case '-':
                    case '\'':
                    case '\"':
                        // If character is a punctuation, increment punctuation count
                        punctuation++;
                        break;
                    default:
                        if (Character.isLetter(ch)) {
                            consonants++;
                        }
                        break;
                }
            }
        }

        // output the number of characters in each category given
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Punctuation: " + punctuation);
        System.out.println("Spaces: " + spaces);

        // Calculate and print the percentages of each type of character
        System.out.println("Vowel Percentage: " + ((double) vowels / totalChars * 100) + "%");
        System.out.println("Consonant Percentage: " + ((double) consonants / totalChars * 100) + "%");
        System.out.println("Punctuation Percentage: " + ((double) punctuation / totalChars * 100) + "%");
        System.out.println("Space Percentage: " + ((double) spaces / totalChars * 100) + "%");

        scanner.close();
    }
}
