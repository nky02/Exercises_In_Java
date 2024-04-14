/*This program utilizes double to calculate for the months'
 raingall average 
    Written by: Nicky Shane Estrada*/

public class AverageRainfall {

    public static void main(String[] args) {
        int rainfallApril = 12;
        int rainfallMay = 14;
        int rainfallJune = 8;

        // Calculion for the average rainfall for the four months
        double averageRainfall = (rainfallApril + rainfallMay + rainfallJune) / 3.0;

        // Output the results
        System.out.println("Rainfall for April:\t" + rainfallApril);
        System.out.println("Rainfall for May:\t" + rainfallMay);
        System.out.println("Rainfall for June:\t" + rainfallJune);
        System.out.printf("Average rainfall:\t%.6f", averageRainfall);
    }
}