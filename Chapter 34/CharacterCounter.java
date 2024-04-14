import java.util.Scanner;

public class CharacterCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a line of text:");
        String line = scanner.nextLine();

        int vowels = 0, consonants = 0, punctuation = 0, spaces = 0;

        for (int i = 0; i < line.length(); i++) {
            char ch = line.charAt(i);
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

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Punctuation: " + punctuation);
        System.out.println("Spaces: " + spaces);

        scanner.close();
    }
}
