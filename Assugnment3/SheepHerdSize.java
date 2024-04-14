/*This program uses for loop and prints out the value of N 
which is  how many years must the sheep heard be supervised
Written by: Nicky Shane Estrada*/

public class SheepHerdSize {
    public static void main(String[] args) {
        double power = 1, N;
        int yearsSupervised = 0;

        // loops from 0 to 25 or until the condition yearsSupervised == 0 is met

        for (int t = 0; t <= 25 && yearsSupervised == t; t++) {
            // Calculate the number of sheep for the current year
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
        // output the number of years sheep herd must be supervised
        System.out.println("The sheep herd must be supervised for " + yearsSupervised + " years.");
    }
}
