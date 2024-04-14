import java.util.Scanner;

public class InternetAcronyms {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.print("Enter Acronym (type 'exit' to quit): ");
            String acronym = scan.nextLine();

            // Check if the user wants to exit
            if (acronym.equalsIgnoreCase("exit")) {
                System.out.println("Exiting program...");
                break;
            }

            StringBuilder output = new StringBuilder();

            // Process each input directly from the input line
            Scanner scanner = new Scanner(acronym);

            while (scanner.hasNext()) {
                String input = scanner.next().trim().toUpperCase();
                String meaning = "";

                // Switch statement to replace acronyms with their meanings
                switch (input) {
                    case "LOL":
                        meaning = "Laugh Out Loud";
                        break;
                    case "BFF":
                        meaning = "Best Friends Forever";
                        break;
                    case "SO":
                        meaning = "Significant Other";
                        break;
                    case "THS":
                    case "THKS":
                    case "TX":
                        meaning = "Thanks";
                        break;
                    case "TBH":
                        meaning = "To Be Honest";
                        break;
                    case "NVM":
                        meaning = "Nevermind";
                        break;
                    case "IDC":
                        meaning = "I Don't Care";
                        break;
                    case "DND":
                        meaning = "Do Not Disturb";
                        break;
                    case "OMW":
                        meaning = "On My Way";
                        break;
                    case "HBD":
                        meaning = "Happy Birthday";
                        break;
                    case "IMO":
                        meaning = "In My Opinion";
                        break;
                    case "BRB":
                        meaning = "Be Right Back";
                        break;
                    case "TMI":
                        meaning = "Too Much Information";
                    case "U.S.":
                        meaning = "United States";
                        break;
                    default:
                        meaning = input;
                }

                output.append(meaning).append(" ");
            }

            System.out.println("Output: " + output.toString().trim());

            scanner.close();
        }

        scan.close();
    }
}
