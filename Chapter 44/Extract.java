import java.util.Scanner;

public class Extract {
    public static void main(String[] args) {
        // Create a Scanner object that reads from the standard input stream
        Scanner scanner = new Scanner(System.in);

        // Process each line of input until there are no more lines
        while (scanner.hasNextLine()) {
            // Read the next line
            String line = scanner.nextLine();

            // If the line starts with "//", print it out
            if (line.startsWith("//")) {
                System.out.println(line);
            }
        }

    }
}