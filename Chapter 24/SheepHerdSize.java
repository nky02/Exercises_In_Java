public class SheepHerdSize {
    public static void main(String[] args) {
        double power = 1, N;
        int yearsSupervised = 0;

        // Iterate through years from 0 to 25 or until the condition yearsSupervised ==
        // t is met
        for (int t = 0; t <= 25 && yearsSupervised == t; t++) {
            // Calculate the number of sheep for the current year using the given formula
            N = 220 / (1 + 10 * power);
            // Print the year and the number of sheep for that year
            System.out.printf("Year %d: %.0f sheep\n", t, N);

            // Check if the number of sheep is less than 80
            if (N < 80) {
                // If the number of sheep is less than 80, increment yearsSupervised
                yearsSupervised++;
                // Update the power for the next iteration
                power *= 0.83;
            }
        }

        System.out.println("The sheep herd must be supervised for " + yearsSupervised + " years.");
    }
}
