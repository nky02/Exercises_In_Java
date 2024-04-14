import java.util.Scanner;

public class BricksPrac {

    static final double GRAVITY = 32.174;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter time in seconds: ");
        double time = scan.nextDouble();

        double distance = 0.5 * BricksPrac.GRAVITY * Math.pow(time, 2);

        System.out.printf("Distance: %.3f", distance);

        scan.close();
    }

}
