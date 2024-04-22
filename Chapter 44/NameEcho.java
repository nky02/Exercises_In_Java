import java.util.Scanner;

public class NameEcho {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String inputName = scanner.nextLine().trim();

        int spaceIndex = inputName.indexOf(" ");
        
        // Check if there is more than one name
        if (spaceIndex > 0) { // There is at least one space, indicating a first and last name
            String firstName = inputName.substring(0, spaceIndex);
            String lastName = inputName.substring(spaceIndex + 1);

            // Convert the last name to uppercase
            lastName = lastName.toUpperCase();

            // Concatenate the first name with the modified last name
            String resultName = firstName.concat(" ").concat(lastName);

            System.out.println(resultName);
        } else { // Only one name is provided
            System.out.println(inputName);
        }

        scanner.close();
    }
}
