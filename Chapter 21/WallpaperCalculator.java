import java.util.Scanner;

public class WallpaperCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int ROLL_WIDTH_INCHES = 27;
        final double ROLL_LENGTH_YARDS = 4.5;
        final double ROLL_LENGTH_INCHES = ROLL_LENGTH_YARDS * 36;
        final double ROLL_AREA = ROLL_WIDTH_INCHES * ROLL_LENGTH_INCHES;

        System.out.print("Enter the room width in feet: ");
        double roomWidth = scanner.nextDouble() * 12; // Convert feet to inches

        System.out.print("Enter the room height in feet: ");
        double roomHeight = scanner.nextDouble() * 12; // Convert feet to inches

        System.out.print("Enter the room length in feet: ");
        double roomLength = scanner.nextDouble() * 12; // Convert feet to inches

        // Calculate the total area
        double totalWallArea = 2 * (roomWidth + roomLength) * roomHeight;

        // number of openings
        System.out.print("Enter the number of openings (windows/doors): ");
        int numberOfOpenings = scanner.nextInt();

        int openingIndex = 0;
        while (openingIndex < numberOfOpenings) {
            System.out.print("Enter the width of opening " + (openingIndex + 1) + " in feet: ");
            double openingWidth = scanner.nextDouble() * 12;

            System.out.print("Enter the height of opening " + (openingIndex + 1) + " in feet: ");
            double openingHeight = scanner.nextDouble() * 12;

            double openingArea = openingWidth * openingHeight;
            totalWallArea -= openingArea;

            openingIndex++;
        }

        int rollsNeededWithoutWaste = (int) Math.ceil(totalWallArea / ROLL_AREA);

        // accurate calculation considering waste
        int totalStrips = 0;
        double[] wallWidths = { roomWidth, roomWidth, roomLength, roomLength };
        int wallIndex = 0;

        //  Calculate the number of rolls without waste
        while (wallIndex < wallWidths.length) {
            int stripsForWall = (int) Math.ceil(wallWidths[wallIndex] / ROLL_WIDTH_INCHES);
            totalStrips += stripsForWall;
            wallIndex++;
        }

        // Calculate the total number of rolls needed, accounting for waste
        int rollsNeededWithWaste = (int) Math.ceil((double) totalStrips * roomHeight / ROLL_AREA);

        System.out.println("Minimum number of rolls needed without considering waste: " + rollsNeededWithoutWaste);
        System.out.println("Number of rolls needed considering waste: " + rollsNeededWithWaste);

        scanner.close();
    }
}