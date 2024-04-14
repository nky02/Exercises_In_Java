import java.util.Scanner;

public class CharCounterWithFileInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initializztion
        int vowels = 0, consonants = 0, punctuation = 0, spaces = 0, totalChars = 0;

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine(); // Read the next line of input
            totalChars += line.length(); // Update the total number of characters encountered so far

            // Iterate through each character in the line
            for (int i = 0; i < line.length(); i++) {
                // Get the current character
                char ch = line.charAt(i);

                // Check the type of character and update the corresponding counter
                switch (Character.toLowerCase(ch)) {
                    case 'a':
                    case 'e':
                    case 'i':
                    case 'o':
                    case 'u':
                        vowels++;
                        break;
                    case ' ':
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

        // Print the counts of different types of characters
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Punctuation: " + punctuation);
        System.out.println("Spaces: " + spaces);

        // Calculate and print the percentages of each type of character
        System.out.println("Vowel Percentage: " + ((double) vowels / totalChars * 100) + "%");
        System.out.println("Consonant Percentage: " + ((double) consonants / totalChars * 100) + "%");
        System.out.println("Punctuation Percentage: " + ((double) punctuation / totalChars * 100) + "%");
        System.out.println("Space Percentage: " + ((double) spaces / totalChars * 100) + "%");

        // Close the scanner to release system resources
        scanner.close();
    }
}
