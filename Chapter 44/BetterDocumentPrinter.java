import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BetterDocumentPrinter {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java CommentPrinter <source-file>");
            System.exit(1);
        }

        String sourceFile = args[0];
        boolean inBlockComment = false;

        try (BufferedReader br = new BufferedReader(new FileReader(sourceFile))) {
            String line;
            while ((line = br.readLine()) != null) {
                line = line.trim(); // Trim whitespace for easy checking of comment syntax
                if (inBlockComment) {
                    // Print all lines inside block comments
                    System.out.println(line);
                    if (line.contains("*/")) {
                        inBlockComment = false;
                    }
                } else {
                    // Check for start of block comment or single line comment in the line
                    int blockCommentStart = line.indexOf("/*");
                    int lineCommentStart = line.indexOf("//");
                    if (blockCommentStart != -1) {
                        inBlockComment = true;
                        // Print from the start of the comment to the end of the line
                        System.out.println(line.substring(blockCommentStart));
                        if (line.indexOf("*/") > blockCommentStart) {
                            // Block comment ends on the same line
                            inBlockComment = false;
                        }
                    } else if (lineCommentStart != -1) {
                        // Handle single line comment
                        System.out.println(line.substring(lineCommentStart));
                    }
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}