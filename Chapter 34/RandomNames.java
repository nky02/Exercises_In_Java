import java.util.Random;

public class RandomNames {
    public static void main(String[] args) {
        Random random = new Random();

        String firstName, lastName;

        // Arrays for random first names and last names
        String[] firstNames = { "Nick", "Bobby", "Sandanz", "Venez", "Wyn", "Ron", "Umbridge", "Hermione", "Draco",
                "Ginney", "Luna", "Legolas" };
        String[] lastNames = { "Baggins", "Lannister", "Targaryen", "Potter", "Riddle", "Snape", "Stark", "Stormborn",
                "Grenderwarld", "Granger", "Lovegood", "Weasely" };

        // Generate first name and last name from the arrays
        int randomIndexFirstName = random.nextInt(firstNames.length);
        int randomIndexLastName = random.nextInt(lastNames.length);

        // Assign the randomly selected first name and last name to variables
        firstName = firstNames[randomIndexFirstName];
        lastName = lastNames[randomIndexLastName];

        // Print the generated s name
        System.out.println("Character Name: " + firstName + " " + lastName);
    }
}
