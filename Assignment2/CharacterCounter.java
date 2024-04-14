/*This program that determines the number of consonants,vowels, punctuation characters,
 and spaces in an input line utilizing  switch statements
Written by: Nicky Shane EStrada */

import java.util.Scanner;

public class CharacterCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ask for a phrase or sentence
        System.out.println("Enter a line of text:");
        String line = scanner.nextLine();

        int vowels = 0, consonants = 0, punctuation = 0, spaces = 0;

        // Iterate through each character in the line
        for (int i = 0; i < line.length(); i++) {
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
        // output the number of characters in each category given
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Punctuation: " + punctuation);
        System.out.println("Spaces: " + spaces);

        scanner.close();
    }
}
