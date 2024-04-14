import java.io.File;
import java.util.Scanner;

public class MaxOfIntFile {
    public static void main(String[] args) throws Exception {
        File file = new File("integers.txt");
        Scanner scanner = new Scanner(file);
        int max = Integer.MIN_VALUE;
        int sum = 0;

        if (scanner.hasNextInt()) {
            max = scanner.nextInt();
            sum = max;
        }

        // Iterate through the remaining integers in the file
        for (int i = 1; i < 5; i++) {
            // Check if there is another integer in the file
            if (scanner.hasNextInt()) {
                // Read the next integer from the file
                int number = scanner.nextInt();
                // Add the integer to the sum
                sum += number;
                // Update the max value if the current integer is greater than the current max

                if (number > max) {
                    max = number;
                }
            }
        }

        System.out.println("Sum of integers: " + sum);
        System.out.println("Maximum integer: " + max);

        scanner.close();
    }
}
