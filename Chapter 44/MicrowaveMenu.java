import java.util.Scanner;

public class MicrowaveMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter cook time-> ");
        String input = scanner.nextLine();

        // Prepare variables for minutes and seconds
        String minutes = "0";
        String seconds = "";

        // Check the length of the input
        if (input.length() <= 2) {
            // If 2 or fewer digits are entered, they represent seconds
            seconds = input.length() == 1 ? "0" + input : input;
        } else {
            // If 3 or more digits are entered, the last two represent seconds
            // and the rest represent minutes
            int length = input.length();
            minutes = input.substring(0, length - 2);
            seconds = input.substring(length - 2);
        }

        // Format the output as "minutes:seconds"
        String formattedTime = minutes + ":" + seconds;

        // Print the formatted time
        System.out.println("Your time->  " + formattedTime);
    }
}