
/* This program asks the user for the name of the input file to be read by the program.
 Written by: Nicky Shane Estrada */
import java.util.Scanner;

public class InputFilePrompt {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fileName;
        boolean isValid;

        // prompt user for a file name
        do {
            System.out.print("input file: ");
            fileName = scanner.nextLine();
            isValid = true; // assume file is valid

            // validate input
            if (!fileName.endsWith(".dat")) {
                System.out.println(">>>file name must end with .dat<<<");
                isValid = false;
            } else if (fileName.contains(" ")) {
                System.out.println(">>>file name must not contain spaces<<<");
                isValid = false;
            } else if (fileName.equals(".dat") || fileName.replace(".dat", "").trim().isEmpty()) {
                System.out.println(">>>file name missing<<<");
                isValid = false;
            }
        } while (!isValid);

        // output validation
        System.out.println("OK");

        scanner.close();
    }
}