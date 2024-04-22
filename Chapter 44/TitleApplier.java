import java.util.Scanner;

public class TitleApplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputLine;

        while (true) {
            System.out.print("Enter a name: ");
            inputLine = scanner.nextLine();

            // Check if the user wants to exit the loop
            if (inputLine.length() == 0)
                break;

            // Define the titles and names
            String title = "";
            String[] femaleNames = { "Amy", "Buffy", "Cathy" };
            String[] maleNames = { "Elroy", "Fred", "Graham" };

            // Check for female names and apply "Ms."
            if (inputLine.startsWith(femaleNames[0] + " "))
                title = "Ms. ";
            else if (inputLine.startsWith(femaleNames[1] + " "))
                title = "Ms. ";
            else if (inputLine.startsWith(femaleNames[2] + " "))
                title = "Ms. ";

            // If no female name was found and title is still empty, check for male names
            // and apply "Mr."
            if (title.isEmpty()) {
                if (inputLine.startsWith(maleNames[0] + " "))
                    title = "Mr. ";
                else if (inputLine.startsWith(maleNames[1] + " "))
                    title = "Mr. ";
                else if (inputLine.startsWith(maleNames[2] + " "))
                    title = "Mr. ";
            }

            // Print the name with or without title
            System.out.println(title + inputLine);
        }

    }
}
