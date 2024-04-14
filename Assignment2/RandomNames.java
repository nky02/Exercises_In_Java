/*This program generates random last name and full name with switch statements
 *Written by: Nicky Shane Estrada*/

import java.util.Random;

public class RandomNames {
    public static void main(String[] args) {
        Random random = new Random();

        String firstName, lastName;

        // Generate random integer between 1 and 12
        int randomIndexFirstName = random.nextInt(12) + 1;
        int randomIndexLastName = random.nextInt(12) + 1;

        // assign first name based on the random integer
        switch (randomIndexFirstName) {
            case 1:
                firstName = "Nick";
                break;
            case 2:
                firstName = "Bobby";
                break;
            case 3:
                firstName = "Sandanz";
                break;
            case 4:
                firstName = "Venez";
                break;
            case 5:
                firstName = "Wyn";
                break;
            case 6:
                firstName = "Ron";
                break;
            case 7:
                firstName = "Umbridge";
                break;
            case 8:
                firstName = "Hermione";
                break;
            case 9:
                firstName = "Draco";
                break;
            case 10:
                firstName = "Ginney";
                break;
            case 11:
                firstName = "Luna";
                break;
            case 12:
                firstName = "Legolas";
                break;
            default:
                firstName = ""; // Default value
                break;
        }

        // assign last name based on the random integer
        switch (randomIndexLastName) {
            case 1:
                lastName = "Baggins";
                break;
            case 2:
                lastName = "Lannister";
                break;
            case 3:
                lastName = "Targaryen";
                break;
            case 4:
                lastName = "Potter";
                break;
            case 5:
                lastName = "Riddle";
                break;
            case 6:
                lastName = "Snape";
                break;
            case 7:
                lastName = "Stark";
                break;
            case 8:
                lastName = "Stormborn";
                break;
            case 9:
                lastName = "Grenderwarld";
                break;
            case 10:
                lastName = "Granger";
                break;
            case 11:
                lastName = "Lovegood";
                break;
            case 12:
                lastName = "Weasely";
                break;
            default:
                lastName = ""; // Default value
                break;
        }

        // Print generated random character name
        System.out.println("Character Name: " + firstName + " " + lastName);
    }
}
