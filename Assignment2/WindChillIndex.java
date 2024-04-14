/*This program calculates the wind chill index given the temperature and the wind speed.
 Written by: Nicky Shane EStrada*/
import java.util.Scanner;
import java.lang.Math;

public class WindChillIndex {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // input
        System.out.println("Enter Wind Speed: ");
        double windSpeedMph = scan.nextDouble();

        System.out.println("Enter Temperature: ");
        double tempF = scan.nextDouble();

        double windChillIndex;

        if (windSpeedMph < 3 && tempF > 50)

            windChillIndex = tempF;

        else

            // calculates wind chill based on the input wind speed and temperature
            windChillIndex = 35.74 + 0.6215 * tempF - 35.75 * Math.pow(windSpeedMph, 0.16)
                    + 0.4275 * tempF * Math.pow(windSpeedMph, 0.16);

        // output
        System.out.println("Wind Chill: " + windChillIndex);

        scan.close();

    }
}
