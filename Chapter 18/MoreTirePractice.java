import java.util.Scanner;

public class MoreTirePractice {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        boolean goodPressure = true;

        System.out.println("Enter pressure of the right-front tire: ");
        int rightFrontPressure = scan.nextInt();
        if (rightFrontPressure < 35 || rightFrontPressure < 45)
            System.out.println("Warning: Pressure is out of range");

        System.out.println("Enter pressure of the left-front tire: ");
        int leftFrontPressure = scan.nextInt();
        if (rightFrontPressure < 35 || rightFrontPressure < 45)
            System.out.println("Warning: Pressure is out of range");

        System.out.println("Enter pressure of the right-rear tire: ");
        int rightRearPressure = scan.nextInt();
        if (rightFrontPressure < 35 || rightFrontPressure < 45)
            System.out.println("Warning: Pressure is out of range");

        System.out.println("Enter pressure of the left-rear tire: ");
        int leftRearPressure = scan.nextInt();
        if (rightFrontPressure < 35 || rightFrontPressure < 45)
            System.out.println("Warning: Pressure is out of range");
            goodPressure = false;

        boolean tirePressureOk = rightFrontPressure == leftFrontPressure;
        boolean tirePressureNotOk = rightRearPressure == leftRearPressure;

        if (tirePressureOk && tirePressureNotOk)

            System.out.println("Inflation is okay");

        else

            System.out.println("Inflation is bad");

        scan.close();
    }
}
