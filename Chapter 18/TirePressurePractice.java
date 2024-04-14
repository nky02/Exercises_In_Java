import java.util.Scanner;

public class TirePressurePractice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter pressure of the right-front tire: ");
        int rightFrontPressure = scan.nextInt();

        System.out.println("Enter pressure of the left-front tire: ");
        int leftFrontPressure = scan.nextInt();

        System.out.println("Enter pressure of the right-rear tire: ");
        int rightRearPressure = scan.nextInt();

        System.out.println("Enter pressure of the left-rear tire: ");
        int leftRearPressure = scan.nextInt();

        boolean tirePressureOk = rightFrontPressure == leftFrontPressure;
        boolean tirePressureNotOk = rightRearPressure == leftRearPressure;

        if (tirePressureOk && tirePressureNotOk)

            System.out.println("Inflation is okay");

        else

            System.out.println("Inflation is NOT okay");

        scan.close();
    }
}
