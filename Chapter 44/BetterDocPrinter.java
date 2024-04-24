import java.util.Scanner;

public class BetterDocPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // indicate whether we are within a multi-line comment block
        boolean withinCommentBlock = false;

        // Process each line of input until there are no more lines
        while (scanner.hasNextLine()) {
            // Read the next line
            String line = scanner.nextLine();

            // Check if the line starts with "//" or "/*"
            if (line.startsWith("//") || line.startsWith("/*"))
                System.out.println(line); // Output
            if (line.startsWith("*/"))
                System.out.println(line); // Output
            withinCommentBlock = false; // Exit the comment block
            if (withinCommentBlock)
                System.out.println(line); // Output the line if within a comment block
            if (line.contains("/*")) {
                System.out.println(line); // Output the line
                withinCommentBlock = true; // Enter a comment block
            }
        }
    }
}
